package Tests;

import Sort.SelectionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest extends UnitTests implements TestInterface {

    @Override
    @Test
    public void sortAlghtorim(int[] arr, int[] result) {
        SelectionSort selectionSort = new SelectionSort();
        String array = Arrays.toString(selectionSort.sortAlghtorim(arr));
        Assert.assertEquals(Arrays.toString(result), array);
    }
}