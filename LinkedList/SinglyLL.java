package com.LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int val){ // Inserting the value from front
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){ // inserting value from last
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){ // inserting at a specific index
        if(index == 0) insertFirst(val);
        if(index == size) insertLast(val);
        
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) tail = null;

        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1) return deleteFirst();

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if (index == 0) return deleteFirst();
        if (index == size-1) return deleteLast();

        Node previous = get(index-1);
        int val = previous.next.value;

        previous.next = previous.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){ // Displaying the Singly Linked List
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private static class Node {
        private final int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.next= next;
            this.value = value;
        }

    }
}
