package com.sparta.adrian.factory;
import com.sparta.adrian.sorter.*;

public class SorterFactory {
    public Sorter getSorter(SorterTypes sortTypes) {
        Sorter sorter = null;
        switch (sortTypes) {
            case MERGE_SORTER:
                sorter = MergeSort.getInstance();
                break;
            case BUBBLE_SORTER:
                sorter = BubbleSort.getInstance();
                break;
            case BINARY_TREE_ASC_SORTER:
                sorter = BinaryTreeAsc.getInstance();
                break;
            case BINARY_TREE_DESC_SORTER:
                sorter = BinaryTreeDesc.getInstance();
                break;
            default:
                break;
        }
        return sorter;
    }
}
