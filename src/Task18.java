public class Task18 {
    static int findMin(int arr[], int low, int high){
        if(high < low) return arr[0];

        if(high == low) return arr[low];

        int mid = low + (high - low) / 2;

        if(mid < high && arr[mid + 1] < arr[mid])
            return arr[mid + 1];

        if(mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        if(arr[high] > arr[mid])
            return findMin(arr, low, mid - 1);
        return findMin(arr, mid + 1, high);
    }

    public static void main(String[] args) {
        int arr1[] = {5, 6, 1, 2, 3, 4};
        int n = arr1.length;
        System.out.println(findMin(arr1, 0, n - 1));
    }
}
