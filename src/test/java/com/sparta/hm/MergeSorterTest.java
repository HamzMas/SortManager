package com.sparta.hm;

import com.sparta.hm.sorters.MergeSorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSorterTest {

    @Test
    @DisplayName("Check that a pre-sorted array returns as a sorted array")
    void checkPreSortedArrayOutput() {
        MergeSorter mergeSorter = new MergeSorter();
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, mergeSorter.sortArray(new int[]{1,2,3,4,5,6,7}));
    }

    @Test
    @DisplayName("Check that an unsorted array returns a correctly sorted array")
    void checkUnsortedArrayIsSortedCorrectly() {
        MergeSorter mergeSorter = new MergeSorter();
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, mergeSorter.sortArray(new int[]{7,4,3,2,6,5,1}));
    }

    @Test
    @DisplayName("Check that an empty array is returned if the input array is null")
    void checkNullInputArrayOutput() {
        MergeSorter mergeSorter = new MergeSorter();
        assertArrayEquals(new int[0], mergeSorter.sortArray(null));
    }
}
