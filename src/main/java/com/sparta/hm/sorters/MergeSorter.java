package com.sparta.hm.sorters;

import java.util.Arrays;

public class MergeSorter implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort != null) {
            int arrayLength = arrayToSort.length;

            if (arrayLength <= 1) {
                return arrayToSort;
            }

            int middleIndex = arrayLength / 2;
            int[] leftHalfArray = new int[middleIndex];
            int[] rightHalfArray = new int[arrayLength - middleIndex];

            for (int i = 0; i < middleIndex; i++) {
                leftHalfArray[i] = arrayToSort[i];
            }

            for (int i = middleIndex; i < arrayLength; i++) {
                rightHalfArray[i - middleIndex] = arrayToSort[i];
            }

            sortArray(leftHalfArray);
            sortArray(rightHalfArray);

            merge(arrayToSort, leftHalfArray, rightHalfArray);

            return arrayToSort;
        }
         return new int[0];

    }

    private static void merge(int[] arrayToSort, int[] leftHalfArray, int[] rightHalfArray) {
        int leftArrayLength = leftHalfArray.length;
        int rightArrayLength = rightHalfArray.length;

        //i = leftHalfIterator, j = rightHalfIterator, k = mergedArrayIterator
        int i = 0,  j = 0, k = 0;

        while(i < leftArrayLength && j < rightArrayLength) {
            if(leftHalfArray[i] <= rightHalfArray[j]) {
                arrayToSort[k] = leftHalfArray[i];
                i++;
            }
            else {
                arrayToSort[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }

        while(i < leftArrayLength) {
            arrayToSort[k] = leftHalfArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            arrayToSort[k] = rightHalfArray[j];
            j++;
            k++;
        }

    }
}
