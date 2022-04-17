import javax.swing.*;

public class Task55 {
    static int findElement(int arr [], int low, int high, int key){
        int n = arr.length;
        if(high < low)
            return -1;
        int mid = (high + low) / 2;
        if(key == arr[mid])
            return mid;
        if(key > arr[mid])
            return findElement(arr, (mid + 1), high, key);
        return findElement(arr, low, (mid - 1), key);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10 };
        System.out.println(findElement(arr, 0, arr.length, 10));
    }
}
