package Sort;

import java.util.Arrays;

public class SelectionSort implements SortAlghoritm {

    @Override
    public String sortAlghtorim(int[] arr) {

        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            int tmp = arr[left];
            arr[left] = arr[minInd];
            arr[minInd] = tmp;
        }
        String arraySorted = Arrays.toString(arr);
        return arraySorted;
    }
}
