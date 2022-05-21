package Test;

import Sort.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortsTest {

    int[] arr = {1, 3, 45, 2};
    int[] result = {1, 2, 3, 45};


    @Test
    public void bubleSortTest() {

        BubleSort bubleSort = new BubleSort();
        Assert.assertEquals(Arrays.toString(result), bubleSort.sortAlghtorim(arr));
    }

    @Test
    public void selectionSortTest(){
        SelectionSort selectionSort = new SelectionSort();
        Assert.assertEquals(Arrays.toString(result), selectionSort.sortAlghtorim(arr));


    }
    @Test
    public void quickSortTest(){
        QuickSort quickSort = new QuickSort();
        Assert.assertEquals(Arrays.toString(result), quickSort.sortAlghtorim(arr));


    }

}
