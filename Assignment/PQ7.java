package com.Assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PQ7 {
    public static void main(String[] args) {
        String fileName = "/Users/Hp/Desktop/sample.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Collections.sort(lines);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (String sortedLine : lines) {
                    writer.write(sortedLine);
                    writer.newLine();
                }
            }

            System.out.println("File content sorted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
