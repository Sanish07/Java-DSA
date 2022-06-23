package Arrays;
// To Remove Duplicates elements from a Sorted Array.
import java.util.Arrays;

public class RemoveDup {
    public static int[] removeDuplicate(int[] arr) {
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,20,20,20,30,30,30,40,40,60};
        int res[] = removeDuplicate(arr);
        System.out.println(Arrays.toString(res));
    }
}
