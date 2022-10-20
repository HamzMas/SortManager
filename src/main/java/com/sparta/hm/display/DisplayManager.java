package com.sparta.hm.display;

import com.sparta.hm.sorters.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

    public static ArrayList<String> sortingAlgorithms = new ArrayList<String>(Arrays.asList("Bubble Sorter", "Merge Sorter"));

    public static void chooseSortingAlgorithm() {
        System.out.println("Enter the number of the sorter you wish to use: ");
        for(int i = 0; i < sortingAlgorithms.size(); i++){
            int number = i + 1;
            System.out.println(number + ". " + sortingAlgorithms.get(i));
        }
    }

    public static void printBeforeSorting(Sorter sorter, int[] arrayToSort) {
        System.out.println("Sorting the array using the " + sorter);
        System.out.println("Inputted Array before sorting: " + Arrays.toString(arrayToSort));
    }


    public static void printSortingResults(Sorter sorter, int[] arrayToSort) {
        int[] sortedArr = sorter.sortArray(arrayToSort);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }



}

