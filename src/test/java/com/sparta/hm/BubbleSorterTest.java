package com.sparta.hm;

import com.sparta.hm.sorters.BubbleSorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSorterTest {

    @Test
    @DisplayName("Check that a pre-sorted array returns as a sorted array")
    void checkPreSortedArrayOutput() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, bubbleSorter.sortArray(new int[]{1,2,3,4,5,6,7}));
    }

    @Test
    @DisplayName("Check that an unsorted array returns a correctly sorted array")
    void checkUnsortedArrayIsSortedCorrectly() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, bubbleSorter.sortArray(new int[]{7,4,3,2,6,5,1}));
    }

    @Test
    @DisplayName("Check that an empty array is returned if the input array is null")
    void checkNullInputArrayOutput() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        assertArrayEquals(new int[0], bubbleSorter.sortArray(null));
    }
}
