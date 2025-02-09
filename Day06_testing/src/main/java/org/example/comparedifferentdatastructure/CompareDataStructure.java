package org.example.comparedifferentdatastructure;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDataStructure {

    public static void main(String[] args) {
        int dataSetSizes[] = {1000, 100_000, 1_000_000};

        for (int n : dataSetSizes) {
            int dataset[] = new int[n];

            // Populate dataset with sequential numbers
            for (int i = 0; i < n; i++) {
                dataset[i] = i + 5;
            }

            int target = dataset.length - 2;

            System.out.println("Dataset Size: " + n);

            // Measure search time for Array (Linear Search)
            long startTime = System.nanoTime();
            arraySearch(dataset, target);
            long endTime = System.nanoTime();
            System.out.println("Time taken by Array Search: " + (endTime - startTime) / 1_000_000.0 + " ms");

            // Measure search time for HashSet
            startTime = System.nanoTime();
            hashSetSearch(dataset, target);
            endTime = System.nanoTime();
            System.out.println("Time taken by HashSet Search: " + (endTime - startTime) / 1_000_000.0 + " ms");

            // Measure search time for TreeSet
            startTime = System.nanoTime();
            treeSetSearch(dataset, target);
            endTime = System.nanoTime();
            System.out.println("Time taken by TreeSet Search: " + (endTime - startTime) / 1_000_000.0 + " ms");

            System.out.println();
        }
    }

    // Linear search in an array
    public static boolean arraySearch(int[] array, int target) {
        for (int value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    // Search using HashSet
    public static boolean hashSetSearch(int[] array, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.contains(target);
    }

    // Search using TreeSet
    public static boolean treeSetSearch(int[] array, int target) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int value : array) {
            treeSet.add(value);
        }
        return treeSet.contains(target);
    }
}
