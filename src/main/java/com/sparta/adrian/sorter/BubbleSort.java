package com.sparta.adrian.sorter;
import com.sparta.adrian.exceptions.ArrayTooSmallException;
import com.sparta.adrian.exceptions.EmptyArrayException;
import com.sparta.adrian.starter.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements Sorter {

    public static final Logger logger = LogManager.getLogger(Main.class);
    private static final BubbleSort BUBBLE_SORTER_INSTANCE = new BubbleSort();

    public static Sorter getInstance() {
        return BUBBLE_SORTER_INSTANCE;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        try {
            bubbleSort(arrayToSort);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        } catch (ArrayTooSmallException e) {
            e.printStackTrace();
        }
        return arrayToSort;
    }


    public static void bubbleSort(int[] array) throws ArrayIndexOutOfBoundsException, NullPointerException, EmptyArrayException, ArrayTooSmallException {
        if (array == null) {
            logger.error("NullPointerException: Array is null!");
            throw new NullPointerException("Array is null!");
        } else if (array.length == 0) {
            logger.error("EmptyArrayException: Array is empty!");
            throw new EmptyArrayException("Array is empty!");
        } else if (array.length == 1) {
            logger.error("ArrayTooSmallException: Array must be larger than one!");
            throw new ArrayTooSmallException("Array must be larger than one!");
        } else {
            if (array.length <= 1) {
                return;
            } else {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {
                        if (array[j] > array[j + 1]) {
                            // swapping values
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
            }
        }
    }
}
