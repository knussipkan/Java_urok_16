import static java.lang.System.out;

public class Task12 {
    static int findMaximum(int arr[], int low, int high){
        int max = arr[low];
        for(int i = 0; i <= high; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {120, 100, 80, 20, 0};
        out.println("The maximum element is " + findMaximum(arr, 0, arr.length - 1));
    }
}
