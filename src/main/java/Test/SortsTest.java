package Test;

import Sort.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortsTest {


    @Before
    public void arrays(){
    }

    @Test
    public void bubleSortTest() {
        int[] result = {1,2,3,45};
        int[] arr = {1,3,45,2};
        BubleSort bubleSort = new BubleSort();
        Assert.assertEquals(Arrays.toString(result), bubleSort.sortAlghtorim(arr));
    }
}
