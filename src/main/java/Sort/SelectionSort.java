package Sort;

import java.util.Arrays;

public class SelectionSort implements SortAlghoritm{

    @Override
    public void sortAlghtorim(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for(int left = 0; left < arr.length; left++){
            int minInd = left;
            for(int i = left; i < arr.length; i++){
                if(arr[i] < arr[minInd]){
                    minInd = i;
                }
            }
            int tmp = arr[left];
            arr[left] = arr[minInd];
            arr[minInd] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
