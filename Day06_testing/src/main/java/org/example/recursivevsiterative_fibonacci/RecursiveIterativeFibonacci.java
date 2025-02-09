package org.example.recursivevsiterative_fibonacci;

public class RecursiveIterativeFibonacci {
    public static void main(String[] args) {


        int[] dataSetSizes = {10, 30, 50}; // Fixed dataset sizes

        for (int n : dataSetSizes) {


            System.out.println("Dataset Size: " + n);

            long startTime = System.nanoTime();
            fibonacciIterative(n);
            long endTime = System.nanoTime();
            System.out.println("Time taken by fibonacciIterative: " + (endTime - startTime) / 1_000_000.0 + " ms");


            // Generate random dataset


             startTime = System.nanoTime();
            fibonacciRecursive(n);
             endTime = System.nanoTime();
            System.out.println("Time taken by fibonacciRecursive: " + (endTime - startTime) / 1_000_000.0 + " ms");



            System.out.println();
            System.out.println();

        }
    }
        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }


        public static int fibonacciIterative(int n) {
            int a = 0, b = 1, sum;
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }


    }
