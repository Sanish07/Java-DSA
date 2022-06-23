package Arrays;
import java.util.Arrays;

//Performing insert and delete operations in Array

public class Operations {

    public static int[] insert(int[] arr, int element,int pos,int cap,int size) {
        int index = pos - 1;
        if(cap == size){
            System.out.println("No space");
            return arr;
        }
        for(int i = size-1; i>=index ; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        return arr;
    }

    public static int[] delete(int arr[],int cap,int element) {
        int i;
        boolean found = false;
        for(i=0;i<cap;i++){
            if(arr[i] == element)
                found = true;
                break;
        }
        if(found) {
            for(int j = i; j < cap - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[cap - 1] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,0};
        int newArr[] = insert(arr,10,2, arr.length,4);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{10,20,30,40,50};
        int[] newArr2 = delete(arr2, arr.length, 100);
        System.out.println(Arrays.toString(newArr2));
    }
}
