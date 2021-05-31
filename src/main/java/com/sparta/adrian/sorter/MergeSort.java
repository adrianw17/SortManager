package com.sparta.adrian.sorter;
import com.sparta.adrian.exceptions.EmptyArrayException;
import com.sparta.adrian.starter.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSort implements Sorter {

    public static final Logger logger = LogManager.getLogger(Main.class);
    private static final MergeSort MERGE_SORTER_INSTANCE = new MergeSort();

    public static Sorter getInstance() {
        return MERGE_SORTER_INSTANCE;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        try {
            mergeSort(arrayToSort);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
        return arrayToSort;
    }

    public static void mergeSort(int[] array) throws ArrayIndexOutOfBoundsException, NullPointerException, EmptyArrayException {
        if (array == null) {
            logger.error("NullPointerException: Array is null!");
            throw new NullPointerException("Array is null!");
        } else if (array.length == 0) {
            logger.error("EmptyArrayException: Array is empty!");
            throw new EmptyArrayException("Array is empty!");
        }  else {
            if (array.length <= 1) {
                return;
            }

            int midpoint = array.length / 2;

            // Declare and initialize left and right arrays.
            int[] left = new int[midpoint];
            int[] right;

            if (array.length % 2 == 0) { // if array.length is an even number.
                right = new int[midpoint];
            } else {
                right = new int[midpoint + 1];
            }

            // Populate the left and right arrays.
            for (int i = 0; i < midpoint; i++) {
                left[i] = array[i];
            }

            for (int j = 0; j < right.length; j++) {
                right[j] = array[midpoint + j];
            }

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    // merging 2 arrays
    private static void merge(int[] array, int[] left, int[] right) {

        int leftIndex = 0, rightIndex = 0, resultIndex = 0;
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    array[resultIndex++] = left[leftIndex++];
                } else {
                    array[resultIndex++] = right[rightIndex++];
                }
            }
            else if (leftIndex < left.length) {
                array[resultIndex++] = left[leftIndex++];
            }
            else if (rightIndex < right.length) {
                array[resultIndex++] = right[rightIndex++];
            }
        }
    }
}