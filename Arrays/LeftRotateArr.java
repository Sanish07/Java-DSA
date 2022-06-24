package Arrays;
import java.util.Arrays;
// Program to Left Rotate an Array by One and 'd' positions respectively in counter-clockwise fashion
public class LeftRotateArr {

    public static int[] lRotateOne(int[] arr) { // Function to Left Rotate an Array by one position
        int len = arr.length, temp = arr[0];
        for(int i=1;i<len;i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        return arr;
    }

    public static int[] lRotateD(int[] arr, int d) { // Time Complexity
        int[] newArr = new int[arr.length];
        int temp;
        for(int i = 0;i<arr.length;i++){
            temp = i - d;
            if(temp < 0){
                temp = arr.length + temp;
            }
            newArr[temp] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[]{10,20,30,40,50};
        arr = lRotateOne(arr);
        System.out.println(Arrays.toString(arr));
        arr2 = lRotateD(arr2,2);
        System.out.println(Arrays.toString(arr2));
    }

}
