package Arrays;
// Moving Zeroes to the End of Array
import java.util.Arrays;
public class MoveZeroes {

    public static int[] move(int[] arr) { //Naive Method
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<n;j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] moveEff(int[] arr) { // Efficient Method
        int count = 0, n = arr.length; //To Keep Track of the last occurring non-zero element while array traversal
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8,0,0,40,20,0,40};
        arr = move(arr);
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[]{10,0,92,0,0,12,20,0};
        newArr = moveEff(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}
