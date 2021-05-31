package com.sparta.adrian.sorter;

public class BinaryTreeAsc implements Sorter{

    private static final BinaryTreeAsc BINARY_TREE_ASC_SORTER = new BinaryTreeAsc();

    public static Sorter getInstance() {
        return BINARY_TREE_ASC_SORTER;
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation(arrayToSort);
        return bt.getSortedTreeAsc();
    }
}
