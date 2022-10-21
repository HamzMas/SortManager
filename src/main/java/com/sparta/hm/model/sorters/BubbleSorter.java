package com.sparta.hm.model.sorters;

import com.sparta.hm.model.logging.CustomLoggerConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSorter implements Sorter{
    private static final Logger logger = Logger.getLogger("bubble-sorter-logger");

    @Override
    public int[] sortArray(int[] arrayToSort) {
        CustomLoggerConfiguration.configureLogger(logger);
        if (arrayToSort != null) {
            //set boolean for while loop
            logger.log(Level.INFO, "inputted array is: " + Arrays.toString(arrayToSort));
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
            logger.log(Level.INFO, "the final sorted array is: " + Arrays.toString(arrayToSort));
            return arrayToSort;
        }
        return new int[0];
    }
}
