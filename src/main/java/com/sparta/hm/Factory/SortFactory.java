package com.sparta.hm.Factory;

import com.sparta.hm.exceptions.SortLoaderException;
import com.sparta.hm.sorters.BubbleSorter;
import com.sparta.hm.sorters.MergeSorter;
import com.sparta.hm.sorters.Sorter;

public class SortFactory {

    public static Sorter getSorter(int choice) throws SortLoaderException{
        switch (choice) {
            case 1:
                return new BubbleSorter();
            case 2:
                return new MergeSorter();
            default:
                throw new SortLoaderException("You have entered an invalid Sorter choice of: " + choice);
        }
    }
}
