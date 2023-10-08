package com.Stack_And_Queue;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) { // this takes care of when it is get full
        if (this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know array is not full
        //insert item
        return super.push(item);
    }
    // here we took data =[1,2,4,5,6]
    // and temp =[0,0,0,0,0,0,0,0,0,0] then updated it into temp =[1,2,4,5,6,0,0,0,0,0]
    // and now data == temp + size as well
}
