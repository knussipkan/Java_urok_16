public class Task32 {
    static int findElement(int[] arr){
        int n = arr.length;
        if(n == 1 || n == 2)
            return -1;

        int element = arr[0], maxx = arr[0],
                bit = -1, check = 0;
        int idx = -1;

        for(int i = 1; i < (n-1);){
            if(arr[i] < maxx && i < (n-1)){
                i++;
                bit = 0;
            }
            else {
                if(arr[i] >= maxx){
                    element = arr[i];
                    idx = i;
                    check = 1;
                    maxx = arr[i];
                }
                if(check == 1){
                    i++;
                }
                bit  = 1;
                while(arr[i] >= element && i < (n-1)){
                    if(arr[i] > maxx){
                        maxx = arr[i];
                    }
                    i++;
                }
                check = 0;
            }
        }
        if(element <= arr[n-1] && bit == 1)
            return idx;
        else return -1;
    }

    public static void main(String[] args) {
        int arr [] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(findElement(arr));
    }
}
