import static java.lang.System.out;

public class Task11 {
    static int linearSearch(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == i)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {-10, -5, 3, 4, 7, 9};
        out.println("Fixed point is " + linearSearch(arr));
    }
}
