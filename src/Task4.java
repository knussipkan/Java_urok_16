import static java.lang.System.out;

public class Task4 {
    static void task4(int arr[], int arr_size){
        int count = 0;
        int l, r, min_sum, sum, min_l, min_r;
        if(arr_size < 2){
            out.println("Invalid input");
            return;
        }
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for(l = 0; l < arr_size - 1; l++){
            for (r = l + 1; r < arr_size; r++){
                sum = arr[l] + arr[r];
                if(Math.abs(min_sum) > Math.abs(sum)){
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
            }
        }
        out.println("The two elements whose sum is minimum are " + arr[min_l] + " and " + arr[min_r]);
    }
    public static void main(String[] args) {
        int arr [] = { 1, 12, -7, -80, 85};
        task4(arr, 5);
    }
}
