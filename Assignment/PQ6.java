package com.Assignment;

import java.io.*;

public class PQ6 {
    public static void main(String[] args) {
        String inputFileName = "/Users/Hp/Desktop/sample.txt";
        String outputFileName = "/Users/Hp/Desktop/sample_modified.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
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


