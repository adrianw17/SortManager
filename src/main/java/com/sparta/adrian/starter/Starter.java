package com.sparta.adrian.starter;
import com.sparta.adrian.exceptions.ChildNotFoundException;
import com.sparta.adrian.factory.*;
import com.sparta.adrian.printer.Printer;
import com.sparta.adrian.sorter.*;

public class Starter {

    SorterFactory sorterFactory = new SorterFactory();

    public static void start() {
        int[] array1 = {1, 5, 2, 8, 10, 9, 66, 53, 0};
        int sorter = 4;

        switch (sorter) {
            case 1:
                startMergeSort(array1);
                break;
            case 2:
                startBubbleSort(array1);
                break;
            case 3:
                startBinaryTreeAsc(array1);
                break;
            case 4:
                startBinaryTreeDesc(array1);
                break;
        }
    }

    private static void startMergeSort(int[] array) {
        SorterFactory sorterFactory = new SorterFactory();
        Sorter mergeSorter = sorterFactory.getSorter(SorterTypes.MERGE_SORTER);
        try {
            Printer.printMergeSortText();
            Printer.printOriginalArray(array);
            long start = System.currentTimeMillis();
            mergeSorter.sortArray(array);
            //MergeSort.mergeSort(array);
            long end = System.currentTimeMillis();
            Printer.printSortedArray(array);
            System.out.println("Merge Sort Time Taken: " + (end - start) + "ms");

        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }

    private static void startBubbleSort(int[] array) {
        SorterFactory sorterFactory = new SorterFactory();
        Sorter bubbleSorter = sorterFactory.getSorter(SorterTypes.BUBBLE_SORTER);
        try {
            Printer.printBubbleSortText();
            Printer.printOriginalArray(array);
            long start = System.currentTimeMillis();
            bubbleSorter.sortArray(array);
            //BubbleSort.bubbleSort(array);
            long end = System.currentTimeMillis();
            Printer.printSortedArray(array);
            System.out.println("Bubble Sort Time Taken: " + (end - start) + "ms");
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }

    private static void startBinaryTreeAsc(int[] array) {
        SorterFactory sorterFactory = new SorterFactory();
        Sorter binaryTreeAscSorter = sorterFactory.getSorter(SorterTypes.BINARY_TREE_ASC_SORTER);
        //BinaryTreeImplementation bt = new BinaryTreeImplementation(array);
        //BinaryTreeAsc bt = new BinaryTreeAsc();
        try {
            Printer.printAscendingTreeText();;
            Printer.printOriginalArray(array);
            //Printer.printSortedArray(bt.sortArray(array));
            long start = System.currentTimeMillis();
            Printer.printSortedArray(binaryTreeAscSorter.sortArray(array));
            long end = System.currentTimeMillis();
            System.out.println("Binary Tree Ascending Time Taken: " + (end - start) + "ms");
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }

    private static void startBinaryTreeDesc(int[] array) {
        SorterFactory sorterFactory = new SorterFactory();
        Sorter binaryTreeDescSorter = sorterFactory.getSorter(SorterTypes.BINARY_TREE_DESC_SORTER);
        //BinaryTreeImplementation bt = new BinaryTreeImplementation(array);
        //BinaryTreeDesc bt = new BinaryTreeDesc();
        try {
            Printer.printDescendingTreeText();
            Printer.printOriginalArray(array);
            long start = System.currentTimeMillis();
            //Printer.printSortedArray(bt.sortArray(array));
            Printer.printSortedArray(binaryTreeDescSorter.sortArray(array));
            long end = System.currentTimeMillis();
            System.out.println("Binary Tree Ascending Time Taken: " + (end - start) + "ms");
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }
}