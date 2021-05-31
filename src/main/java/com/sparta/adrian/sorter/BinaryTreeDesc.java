package com.sparta.adrian.sorter;

public class BinaryTreeDesc implements Sorter{

    private static final BinaryTreeDesc BINARY_TREE_DESC_SORTER = new BinaryTreeDesc();

    public static Sorter getInstance() {
        return BINARY_TREE_DESC_SORTER;
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation(arrayToSort);
        return bt.getSortedTreeDesc();
    }
}
