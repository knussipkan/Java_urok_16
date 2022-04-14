import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

import static java.lang.System.out;

public class Task7 {
    static void kLargest(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < k; i++)
            out.print(arr[i] + " ");
    }
    static ArrayList<Integer> kLargest(int [] arr, int k){
        Integer[] obj_arr = Arrays.stream(arr).boxed().toArray(Integer [] :: new);
        Arrays.sort(obj_arr, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);
        for(int i = 0; i < k; i++)
            list.add(obj_arr[i]);
        return list;
    }
    public static void main(String[] args) {
        Integer arr [] = new Integer[] { 1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        kLargest(arr, k);
    }
}
