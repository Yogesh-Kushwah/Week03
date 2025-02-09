package Searching;

import org.example.searchtargetlargedataset.SearchComparisionBwTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchingComparisonTesting {


        @Test
        public void linearSearchTesting(){
            int arr[]= {7,8,1,9,0,2,3};
            int target= 2;

            int expected= 5;
            int actual =SearchComparisionBwTwo.linearSearch(arr,target);

            Assertions.assertEquals(expected,actual);

        }

        @Test
        public void binarySearchTesting(){
        int arr[]= {7,8,1,9,0,2,3};
        Arrays.sort(arr);
        int target= 8;

        int expected= 5;

        int actual = SearchComparisionBwTwo.binarySearch(arr,target);

        Assertions.assertEquals(expected,actual);
        Assertions.assertDoesNotThrow(()->SearchComparisionBwTwo.binarySearch(arr,target) );

    }


}
