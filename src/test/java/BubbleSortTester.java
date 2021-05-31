import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.sparta.adrian.sorter.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class BubbleSortTester {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    @DisplayName("Testing Bubble Sort")
    public void testBubbleSort(){
        int[] array1 = {1, 5, 2, 8, 10, 9};
        int[] array2 = {4, 8, 9, 13, 17, 20};  //already ordered
        int[] array3 = {-4, 13, -5, 0, 109, 8};  //negative values

        int[] array1Sorted = {1, 2, 5, 8, 9, 10};
        int[] array2Sorted = {4, 8, 9, 13, 17, 20};
        int[] array3Sorted = {-5, -4, 0, 8, 13, 109};

        Assertions.assertArrayEquals(array1Sorted, bubbleSort.sortArray(array1));
        Assertions.assertArrayEquals(array2Sorted, bubbleSort.sortArray(array2));
        Assertions.assertArrayEquals(array3Sorted, bubbleSort.sortArray(array3));
    }

    @Test
    @DisplayName("Testing Bubble Sort")
    public void testLargeBubbleSort(){





    }

}