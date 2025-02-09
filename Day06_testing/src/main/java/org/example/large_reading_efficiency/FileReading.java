package org.example.large_reading_efficiency;

import java.io.*;

public class FileReading {
    public static void main(String[] args) {

        String[] filePaths = {"1mb.txt", "100mb.txt", "500mb.txt"}; // Fixed dataset sizes

        for (String filePath : filePaths) {


            System.out.println("Dataset Size: " + filePath);

            // FileReader Benchmark
            long startTime = System.nanoTime();

            try (FileReader fileReader = new FileReader(filePath)) {
                int element;
                while ((element = fileReader.read()) != -1) {
                    // Just read the element
                }
            } catch (IOException e) {

            }
            long endTime = System.nanoTime();
            System.out.println("Time taken by FileReader: " + (endTime - startTime) / 1_000_000.0 + " ms");

            // InputStreamReader Benchmark
            startTime = System.nanoTime();
            try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
                int element;
                while ((element = inputStreamReader.read()) != -1) {
                    // Just read the element
                }
            } catch (IOException e) {

            }
            endTime = System.nanoTime();
            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) / 1_000_000.0 + " ms");

            System.out.println();
        }
    }
}
