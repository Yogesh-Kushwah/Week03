package org.example.stringconcatenation;

public class StringConcatenation {

    public static void main(String[] args) {

        int[] dataSetSizes = {1000, 10000, 1000000}; // Fixed dataset sizes

        for (int n : dataSetSizes) {


            // Generate random dataset

            System.out.println("Dataset Size: " + n);
          long  startTime= System.nanoTime();
            operationStringBuffer(n);
           long endTime= System.nanoTime();
            System.out.println("Time taken by String Buffer: "+ (endTime-startTime)/1_000_000.0+" ms");


            startTime= System.nanoTime();
            operationStringBuilder(n);
            endTime= System.nanoTime();
            System.out.println("Time taken by String Builder: "+ (endTime-startTime)/1_000_000.0+" ms");


             startTime = System.nanoTime();
            operationString(n);
             endTime = System.nanoTime();

            System.out.println("Time taken by String: " + (endTime - startTime) / 1_000_000.0 + " ms");

            System.out.println();
            System.out.println();

        }
    }

    public static void operationStringBuilder(int dataSet) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i< dataSet;i++){
            sb.append("a");
        }

    }

    public static String operationStringBuffer(int dataSet) {
          StringBuffer bf= new StringBuffer();
        for(int i=0;i< dataSet;i++){
            bf.append("a");
        }
        return bf.toString();
    }

    public static void operationString(int dataSet) {
        String result=" ";

        for(int i=0;i< dataSet;i++){

            result+= "Hello";
        }
    }
}