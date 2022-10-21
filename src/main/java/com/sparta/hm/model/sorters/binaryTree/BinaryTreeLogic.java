package com.sparta.hm.model.sorters.binaryTree;

import com.sparta.hm.exceptions.ChildNotFoundException;

public class BinaryTreeLogic implements BinaryTree{
    private final Node rootNode;

    public static class Node {

        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            return leftChild == null;
        }

        public boolean isRightChildEmpty() {
            return rightChild == null;
        }

    }

    public BinaryTreeLogic(Node rootNode) {
        this.rootNode = rootNode;
    }



    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void AddElement(int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for(int element:elements) {
            addNodeToTree(rootNode, element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if(node != null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getLeftChild(int element) {
        Node node = findNode(element);
        return node.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) {
        Node node = findNode(element);
        return node.getLeftChild().getValue();
    }

    @Override
    public int[] getSortedTreeAscending() {
        //give an array
        //put array in the tree and build a tree from it
        //walk through the finding smallest number up to biggest number
        //every time i find a number i put it into an array
        //return final array


        return new int[0];
    }

    @Override
    public int[] getSortedTreeDescending() {
        return new int[0];
    }

    //add node to the tree
    private void addNodeToTree(Node node, int element) {
        //if the new element being added is lower
        //than the value of the current node
        if(element < node.getValue()) {
            //check to see the left child of current node is empty
            if(node.isLeftChildEmpty()) {
                //if yes, then set left child to a new node with the element
                node.setLeftChild(new Node(element));
            }
            else{
                //recursively run the method again
                //this time passing in the left child of the current element
                //to add the new inputted element into the tree
                addNodeToTree(node.getLeftChild(), element);
            }
        }
        else if(element >= node.getValue()) {
            if(node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            }
            else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }


    private Node findNode(int element) {
        Node node = rootNode;
        while(node != null) {
            if(element == node.getValue()) {
                return node;
            }
            if(element < node.getValue()) {
                node = node.getLeftChild();
            }
            else if(element > node.getValue()) {
                node = node.getRightChild();
            }
        }

        return null;
    }


}
