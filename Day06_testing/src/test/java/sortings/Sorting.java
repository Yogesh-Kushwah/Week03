package sortings;

import org.example.sorting_largedataset_efficiently.SortingComparison;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sorting {


    @Test
    public void quickSortTest(){
        int []arr={4,5,8,2,5,1};

        int []expectedArr={1,2,4,5,5,8};

        SortingComparison.quickSort(arr,0,arr.length-1);

        Assertions.assertArrayEquals(expectedArr,arr);

    }


    @Test
    public void mergeSortTest(){

        int []arr={4,5,8,2,5,1};

        int []expectedArr={1,2,4,5,5,8};
        SortingComparison.mergeSort(arr, 0,arr.length-1);

        Assertions.assertArrayEquals(expectedArr,arr);
    }


    @Test
    public void bubbleTest(){
        int []arr={4,5,8,2,5,1};

        int []expectedArr={1,2,4,5,5,8};
        SortingComparison.bubbleSort(arr);

        Assertions.assertArrayEquals(expectedArr,arr);
        Assertions.assertDoesNotThrow(() -> SortingComparison.bubbleSort(arr));



    }
}
