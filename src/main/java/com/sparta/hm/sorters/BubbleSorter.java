package com.sparta.hm.sorters;

public class BubbleSorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort != null) {
            //set boolean for while loop
            boolean swappedNumbers = true;
            while (swappedNumbers) {
                //set bool to false if no elements are sorted
                swappedNumbers = false;

                //for loop to loop through numbers array
                //when i < numbers.length - 1 so last element is not compared against nothing
                for (int i = 0; i < arrayToSort.length - 1; i++) {

                    //check to see if current element of array is larger than next element of array
                    if (arrayToSort[i] > arrayToSort[i + 1]) {

                        //set bool to true when an element is sorted
                        swappedNumbers = true;

                        //set temp variable to current element of array
                        int temp = arrayToSort[i];

                        //update current element with the next element of the array (as it's smaller)
                        arrayToSort[i] = arrayToSort[i + 1];

                        //update next element of array with temp variable (previous current element of array)
                        arrayToSort[i + 1] = temp;
                    }
                }
            }
            return arrayToSort;
        }
        return new int[0];
    }
}
