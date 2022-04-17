public class Task39 {
    static  void maximumElements(int arr[]){
        int first, second, third, i;
        int n = arr.length;
        if(n < 3){
           System.out.println("Invalid input");
           return;
        }
        first = second = third = Integer.MIN_VALUE;
        for(i = 0; i < n; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
           else if(arr[i] > second){
               third = second;
               second = arr[i];
           }
          else if(arr[i] > third){
               third = arr[i];
           }
        }
        System.out.println(first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int arr [] = { 12, 45, 20, 4, 63, 0};
        maximumElements(arr);
    }
}
