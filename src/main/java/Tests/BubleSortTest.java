package Tests;

import Sort.BubleSort;
import org.junit.Assert;
import org.junit.Test;

public class BubleSortTest extends UnitTests implements TestInterface {

    @Override
    @Test
    public void sortAlghtorim(int[] arr, int[] result) {
        BubleSort bubleSort = new BubleSort();
        Assert.assertArrayEquals(bubleSort.sortAlghtorim(arr), result);
    }
}
