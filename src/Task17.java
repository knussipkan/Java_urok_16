import java.util.HashMap;
import java.util.Map;

public class Task17 {
    static void nk(int arr[], int k){
        int n = arr.length;
        int x = n / k;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], 1);
            else{
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count + 1);
            }
        }
        for(Map.Entry m : hashMap.entrySet()){
            Integer t = (Integer)m.getValue();
            if(t > x)
                System.out.println(m.getKey());
        }
    }

    public static void main(String[] args) {
        int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
                2, 2, 3, 1, 1, 1 };
        int k = 4;
        nk(a, k);
    }
}
