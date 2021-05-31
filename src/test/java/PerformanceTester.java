import com.sparta.adrian.sorter.BinaryTreeAsc;
import com.sparta.adrian.sorter.BinaryTreeDesc;
import com.sparta.adrian.sorter.BubbleSort;
import com.sparta.adrian.sorter.MergeSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTester {

    BubbleSort bs = new BubbleSort();
    MergeSort ms = new MergeSort();
    BinaryTreeAsc bta = new BinaryTreeAsc();
    BinaryTreeDesc btd = new BinaryTreeDesc();

    int[] smallArray = {1, 5, 2, 8, 10, 9};

    @Test
    @DisplayName("Bubble Sort Time (Small)")
    public void testSmallBubbleSortTime() {
        long start = System.currentTimeMillis();
        bs.sortArray(smallArray);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort (Small) Time Taken: " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Merge Sort Time (Small)")
    public void testSmallMergeSortTime() {
        long start = System.currentTimeMillis();
        ms.sortArray(smallArray);
        long end = System.currentTimeMillis();
        System.out.println("Merge Sort Time (Small) Taken: " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Binary Tree Ascending Time (Small)")
    public void testSmallBinaryTreeAscTime() {
        long start = System.currentTimeMillis();
        bta.sortArray(smallArray);
        long end = System.currentTimeMillis();
        System.out.println("Binary Tree Ascending (Small) Time Taken: " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Binary Tree Descending Time (Small)")
    public void testSmallBinaryTreeDescTime() {
        long start = System.currentTimeMillis();
        btd.sortArray(smallArray);
        long end = System.currentTimeMillis();
        System.out.println("Binary Tree Descending (Small) Time Taken: " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Bubble Sort Test numbers (Large)")
    public void testLargeBubbleSort() {
        Random rd = new Random(); // creating Random object
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rd.nextInt(); // storing random integers in an array
        }

        long start = System.currentTimeMillis();
        bs.sortArray(largeArray);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time Taken (Large): " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Merge Sort Test numbers (Large)")
    public void testLargeMergeSort() {
        Random rd = new Random(); // creating Random object
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rd.nextInt(); // storing random integers in an array
        }

        long start = System.currentTimeMillis();
        ms.sortArray(largeArray);
        long end = System.currentTimeMillis();
        System.out.println("Merge Sort Time Taken (Large): " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Binary Tree Ascending numbers (Large)")
    public void testLargeBinaryTreeAsc() {
        Random rd = new Random(); // creating Random object
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rd.nextInt(); // storing random integers in an array
        }

        long start = System.currentTimeMillis();
        bta.sortArray(largeArray);
        long end = System.currentTimeMillis();
        System.out.println("Binary Tree Ascending (Large) Time Taken: " + (end - start) + "ms");
    }

    @Test
    @DisplayName("Binary Tree Descending numbers (Large)")
    public void testLargeBinaryTreeDesc() {
        Random rd = new Random(); // creating Random object
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rd.nextInt(); // storing random integers in an array
        }

        long start = System.currentTimeMillis();
        btd.sortArray(largeArray);
        long end = System.currentTimeMillis();
        System.out.println("Binary Tree Descending (Large) Time Taken: " + (end - start) + "ms");
    }


}
