package Sort;

import java.util.Arrays;

public class BubleSort implements SortAlghoritm {

    @Override
    public String sortAlghtorim(int[] arr) {
        boolean iter = true;
        while (iter) {
            iter = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    iter = true;
                }
            }
        }
        String arraySorted = Arrays.toString(arr);
        return arraySorted;
    }
}
