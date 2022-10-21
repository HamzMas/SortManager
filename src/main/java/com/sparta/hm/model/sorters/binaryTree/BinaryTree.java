package com.sparta.hm.model.sorters.binaryTree;

import com.sparta.hm.exceptions.ChildNotFoundException;

public interface BinaryTree {

    int getRootElement();

    int getNumberOfElements();

    void AddElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAscending();

    int[] getSortedTreeDescending();
}
