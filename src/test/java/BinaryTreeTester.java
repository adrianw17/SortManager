import com.sparta.adrian.sorter.BinaryTreeAsc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTester {

    BinaryTreeAsc bt = new BinaryTreeAsc();

    @Test
    @DisplayName("Testing Binary Tree Search")
    public void testMergeSort() {

        int[] array1 = {1, 5, 2, 8, 10, 9};
        int[] array2 = {4, 8, 9, 13, 17, 20};  //already ordered
        int[] array3 = {-4, 13, -5, 0, 109, 8};  //negative values

        int[] array1Sorted = {1, 2, 5, 8, 9, 10};
        int[] array2Sorted = {4, 8, 9, 13, 17, 20};
        int[] array3Sorted = {-5, -4, 0, 8, 13, 109};

        Assertions.assertArrayEquals(array1Sorted, bt.sortArray(array1));
        Assertions.assertArrayEquals(array2Sorted, bt.sortArray(array2));
        Assertions.assertArrayEquals(array3Sorted, bt.sortArray(array3));
    }
}
