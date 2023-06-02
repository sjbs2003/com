package com.Assignment;
import java.util.LinkedList;
class Producer implements Runnable {
    private final LinkedList<Integer> buffer;
    private final int maxSize;
    public Producer(LinkedList<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer.add(i);
                System.out.println("Produced: " + i);
                buffer.notify();
            }
        }
    }
}
class Consumer implements Runnable {
    private final LinkedList<Integer> buffer;
    public Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = buffer.removeFirst();
                System.out.println("Consumed: " + value);
                buffer.notify();
            }
        }
    }
}

public class PQ4 {
    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<>();
        int maxSize = 5;
        Thread producerThread = new Thread(new Producer(buffer, maxSize));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}

