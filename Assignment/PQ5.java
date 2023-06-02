package com.Assignment;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class PQ5 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception occurred.");
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            int result = 10/0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
