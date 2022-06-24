package Arrays;
import java.util.Arrays;
// Program to Reverse an Array
public class ArrayRev {
    public static int[] reverse(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
