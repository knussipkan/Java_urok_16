public class Task16 {
    static int findPeak(int arr[], int n){
        if( n == 1)
            return 0;
        if(arr[0] >= arr[1])
            return 0;
        if(arr[n-1] >= arr[n-1])
            return n - 1;

        for(int i = 0; i < n - 1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr [] = {5, 10, 20, 12};
        int n = arr.length;
        System.out.println(findPeak(arr, n));
    }
}
