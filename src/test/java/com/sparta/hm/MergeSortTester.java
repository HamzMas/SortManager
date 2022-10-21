package com.sparta.hm;

import com.sparta.hm.controller.SortFactory;
import com.sparta.hm.exceptions.SortLoaderException;
import com.sparta.hm.model.sorters.Sorter;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTester {


    private static Sorter sorter;

    private int[] unsortedArray;

    @BeforeAll
    public static void setClass() throws SortLoaderException {
        sorter = SortFactory.getSorter(2);
        System.out.println("Testing using the " + sorter);
    }

    @BeforeEach
    public void setup() {
        Random rng = new Random();
        unsortedArray = new int[10];
        for(int i = 0; i < 10; i++) {
            unsortedArray[i] = rng.nextInt(100)+1;
        }
    }

    @Test
    @DisplayName("Test that the sorter sorts the array correctly")
    public void testSortedCorrectly() {
        int[] sortedArray = sorter.sortArray(unsortedArray);
        int[] expectedArray = unsortedArray.clone();
        Arrays.sort(expectedArray);

        Assertions.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    @DisplayName("Test array sorts correctly with odd sized array")
    public void testOddSizedArray() {
        int[] unsortedArray = {7,6,5,3,25,8,2,1,9};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        int[] expectedArray = unsortedArray.clone();
        Arrays.sort(expectedArray);
        Assertions.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    @DisplayName("Test array sorts pre-sorted array correclty")
    public void testPreSortedArray() {
        int[] unsortedArray = {1,2,3,4,5,6,7,8};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        int[] expectedArray = unsortedArray.clone();
        Arrays.sort(expectedArray);
        Assertions.assertArrayEquals(expectedArray, sortedArray);

    }
}
