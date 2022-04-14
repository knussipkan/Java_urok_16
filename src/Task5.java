import static java.lang.System.out;

public class Task5 {
    static void smallestElement(int arr[]){
        int first, second;
        int n = arr.length;
        if(n < 2){
            out.println("Invalid input");
            return;
        }
        first = second = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if(second == Integer.MAX_VALUE)
            out.println("There is no second smallest element");
        else
            out.println("The smallest element is " + first + " and second smallest element is " + second);
    }
    public static void main(String[] args) {
       int arr[] = { 15, 17, 19, 20, 23};
       smallestElement(arr);
    }
}
