public class Task51 {
    static int findElement(int arr[], int key){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 10, 6, 40};
        int position = findElement(arr, 40);
        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println(position + 1);
    }
}
