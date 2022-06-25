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

    public static int[] lRotateD(int[] arr, int d) { // Time Complexity : Theta(n), Space complexity : Theta(n)
        d %= arr.length;
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

    public static int[] lRotateDEff(int[] arr, int d) {
        d %= arr.length;
        arr = reverse(arr,0,d-1);
        arr = reverse(arr,d,arr.length-1);
        arr = reverse(arr,0, arr.length-1);
        return arr;
    }

    public static int[] reverse(int[] arr, int lower, int higher){ // For usage by lRotateDEff Method
        while(lower < higher){
            int temp = arr[lower];
            arr[lower] = arr[higher];
            arr[higher] = temp;

            lower++;
            higher--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[]{10,20,30,40,50};
        int[] arr3 = new int[]{1,2,3,4,5};

        arr = lRotateOne(arr); //Left Rotate by One position
        System.out.println(Arrays.toString(arr));

        arr2 = lRotateD(arr2,4); //Left Rotate by D positions
        System.out.println(Arrays.toString(arr2));

        arr3 = lRotateDEff(arr3,2);
        System.out.println(Arrays.toString(arr3));
    }

}
