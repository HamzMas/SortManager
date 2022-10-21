package com.sparta.hm.controller;

import com.sparta.hm.view.DisplayManager;
import com.sparta.hm.exceptions.SortLoaderException;
import com.sparta.hm.model.sorters.Sorter;

import java.util.Random;
import java.util.Scanner;

public class SortLoader {
    private final static Scanner scanner = new Scanner(System.in);

    public static void start() {
        try{
            DisplayManager.chooseSortingAlgorithm();
            Sorter sorter = SortFactory.getSorter(scanner.nextInt());
            System.out.println("PLease enter the size of the array you wish to sort (must be between 0 and 1000): ");

            int inputSize = getArraySizeFromUser();
            int arraySize = validateArraySize(inputSize);

            int[] unsortedArray = populateArray(arraySize);

            DisplayManager.printBeforeSorting(sorter, unsortedArray);
            DisplayManager.printSortingResults(sorter, unsortedArray);

        }
        catch(SortLoaderException err) {
            System.out.println(err.getMessage());
            start();
        }
    }

    private static int validateArraySize(int arraySize) {
        while(arraySize < 0 || arraySize > 1000) {
            System.out.println("Invalid Number! Please enter a number between 0 and 1000");
            arraySize = getArraySizeFromUser();
        }
        return arraySize;
    }

    public static int getArraySizeFromUser() {
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Not a valid int! Please enter a number between 0 and 1000");
        }
        return scanner.nextInt();
    }

    private static int[] populateArray(int arraySize) {
        Random rng = new Random();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = rng.nextInt(1000);
        }
        return arr;
    }
}