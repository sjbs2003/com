package com.Assignment;

import java.util.Arrays;

public class ArrayDeletion {
    private int[] array;

    public ArrayDeletion(int[] array) {
        this.array = array;
    }

    public void deleteElement(int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }

            array = newArray;
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public void displayArray() {
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayDeletion arrayDeletion = new ArrayDeletion(numbers);
        arrayDeletion.displayArray();

        int elementToDelete = 5;
        arrayDeletion.deleteElement(elementToDelete);
        arrayDeletion.displayArray();
    }
}


