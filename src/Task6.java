import static java.lang.System.out;

public class Task6 {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[]){
        int n = arr.length;
        Pair minmax = new Pair();
        if(n == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if(arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for(int i = 2; i < n; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        int arr [] = {1, 45, 7, 8, 4, 6};
        Pair p = getMinMax(arr);
        out.printf("\nMinimum element is %d", p.min);
        out.printf("\nMaximum element is %d", p.max);
    }
}
