package org.example.searchtargetlargedataset;

import java.util.Arrays;

public class SearchComparisionBwTwo {

    public static int linearSearch(int[] arr,int target){

        for(int i=0 ;i<arr.length;i++){

            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static  int binarySearch(int arr[], int target){


        int left=0; int right= arr.length-1;

        while (left<=right){

            int mid= left +(right-left)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left= mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int DatasetSize[]= {1000,10000,1000000};

        for(int size: DatasetSize){

            int Dataset[]= new int[size];

            for (int i=0;i<size;i++){

                Dataset[i]=i+1;
            }

            int target= size-1;


            long startTime= System.nanoTime();

            linearSearch(Dataset,target);
            long endTime= System.nanoTime();

            System.out.println("Time taken by Linear Search: "+ (endTime-startTime)/1000000.0+" ms");


            Arrays.sort(Dataset);
            startTime= System.nanoTime();
            binarySearch(Dataset,target);
             endTime= System.nanoTime();

            System.out.println("Time taken by binary Search: "+ (endTime-startTime)/1000000.0+" ms");
            System.out.println();
            System.out.println();
        }


    }
}
