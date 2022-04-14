import static java.lang.System.out;

public class Task9 {
    static int task9(int arr[], int x){
        int res = 0;
        int n = arr.length;
        for(int i = 0; i < n; i ++)
            if(x == arr[i])
                res++;
        return res;
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int x = 2;
        out.println(task9(arr, x));
    }
}
