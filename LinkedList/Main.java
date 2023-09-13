package com.LinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertFirst(1);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(3);
//        list.insertLast(2);
//        list.insert(35,1);
//        list.display();
////        System.out.println(list.deleteFirst());
////        list.display();
////        System.out.println(list.deleteLast());
////        list.display();
//        System.out.println(list.delete(2));
//        list.display();



//        DoublyLL list = new DoublyLL();
//        list.InsertFirst(1);
//        list.InsertFirst(12);
//        list.InsertFirst(16);
//        list.InsertFirst(11);
//        list.insertLast(2);
//        list.insert(1,7);
//        list.display();


        CircularLL list = new CircularLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.display();
        list.delete(4);
        list.display();
    }
}
