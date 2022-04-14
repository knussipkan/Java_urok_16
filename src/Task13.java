import java.io.*;

import static java.lang.System.out;

public class Task13 {
    static boolean findPair(int arr[], int n){
        int size = arr.length;
        int i = 0, j = 1;
        while(i < size && j < size){
            if(i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)){
                out.println("Pair found: " + "(" + arr[i] + "," + arr[j] + ")");
                return true;
            }
            else if(arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
        out.println("No such pair");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        findPair(arr, n);
    }
}
