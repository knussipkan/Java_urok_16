import static java.lang.System.out;

public class Task10 {
    static void printTwoElements(int arr[]){
        int n = arr.length;
        out.println("The repeating element is ");
        for(int i = 0; i < n; i++){
            int abs_val = Math.abs(arr[i]);
            if(arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                out.println(abs_val);
        }
        out.println("And the missing element is ");
        for(int i = 0; i < n; i++){
            if(arr[i] > 0)
                out.println( i + 1);
        }
    }
    public static void main(String[] args) {
        int arr [] = {3, 1, 3};
        printTwoElements(arr);
    }
}
