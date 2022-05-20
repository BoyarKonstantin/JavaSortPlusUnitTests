package Sort;

import java.util.Arrays;

public class BubleSort implements SortAlghoritm {

    @Override
    public void sortAlghtorim(int[] arr) {
        System.out.println(Arrays.toString(arr));
        boolean iter = true;
        while (iter) {
            iter = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    iter = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
