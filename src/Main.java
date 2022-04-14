import java.awt.*;

import static java.lang.System.out;

public class Main {
    public static int Task1(int arr[]){
        int n = arr.length;
        int sum = ((arr.length + 1) * (arr.length + 2)) / 2;
        for(int i = 0; i < n; i++){
            sum -= arr[i];
        }

        return  sum;
    }



    public static void main(String[] args) {
        // Task 1
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        out.println(Task1(arr));
    }
}
