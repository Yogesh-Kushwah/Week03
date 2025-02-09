package org.example.sorting_largedataset_efficiently;

public class SortingComparison {
    public static void main(String[] args) {

        int[] dataSetSizes = {1000, 10000, 1000000}; // Fixed dataset sizes

        for (int n : dataSetSizes) {
            int dataSet[] = new int[n];

            // Generate random dataset
            for (int i = 0; i < dataSet.length; i++) {
                dataSet[i] = (int) (Math.random() * 1000); // Generate random integers (0-999)
            }

            int length = dataSet.length - 1;

            // Measure time for Merge Sort
            long startTime = System.nanoTime();
            mergeSort(dataSet, 0, length);
            long endTime = System.nanoTime();
            System.out.println("Dataset Size: " + n);
            System.out.println("Time taken by Merge Sort: " + (endTime - startTime) / 1_000_000.0 + " ms");


             startTime= System.nanoTime();
            quickSort(dataSet,0,length);
             endTime= System.nanoTime();
            System.out.println("Time taken by quick Sort: "+ (endTime-startTime)/1_000_000.0+" ms");


            startTime= System.nanoTime();
            bubbleSort(dataSet);
            endTime= System.nanoTime();
            System.out.println("Time taken by bubble Sort: "+ (endTime-startTime)/1_000_000.0+" ms");
            System.out.println();
            System.out.println();

        }
    }

 public static void quickSort(int[] arr,int low, int high) {

     if (low >= high) {
         return;  // Base condition: if array has one or no elements
     }

     // Partitioning and recursive calls
     int pivot = partition(arr, low, high);
     quickSort(arr, low, pivot - 1);  // Sort left subarray
     quickSort(arr, pivot + 1, high);  // Sort right subarray
 }


    // Partition function to select a pivot and place it in the correct position
      public static int partition(int[] arr,int  low, int high) {
             int pivot = arr[high];  // Pivot is selected as the last element
             int i = low - 1;

             // Rearrange elements smaller than pivot to the left
             for (int j = low; j < high; j++) {
                 if (arr[j] < pivot) {
                     i++;
                     // Swap elements
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }

             // Place pivot in its correct position
             i++;
             int temp = arr[i];
             arr[i] = arr[high];
             arr[high] = temp;

             return i;  // Return pivot index
         }






    public static void mergeSort(int[] dataSet, int start, int end) {
        // Base condition to stop recursion
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        // Recursively sort the left and right halves
        mergeSort(dataSet, start, mid);
        mergeSort(dataSet, mid + 1, end);

        // Merge the two sorted halves
        merge(dataSet, start, mid, end);
    }

    public static void merge(int arr[], int st, int mid, int end) {
        int i = st;
        int j = mid + 1;
        int k = 0;

        int[] mergeArr = new int[end - st + 1];

        // Merge two sorted halves
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mergeArr[k++] = arr[i++];
            } else {
                mergeArr[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            mergeArr[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j <= end) {
            mergeArr[k++] = arr[j++];
        }

        // Copy the merged array back to the original array
        for (int a = 0, y = st; a < mergeArr.length; a++, y++) {
            arr[y] = mergeArr[a];
        }
    }



   public  static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
