package com.Stack_And_Queue;

public class Practice {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Practice(){
        this(DEFAULT_SIZE);
    }

    public Practice(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] =item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }

    public boolean isFull(){
       return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

}

