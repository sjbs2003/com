package com.Assignment;

import java.io.*;

public class PQ6 {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String uppercaseLine = line.toUpperCase();
                writer.write(uppercaseLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

