package Arrays;
// Program to return the index of largest and second-largest element in an array
public class LargestElement {
    public static int findLargest(int arr[]) {
        int largest = 0;
        for(int i=1;i< arr.length;i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    public static int secondLargest(int arr[]) {
        int largest = findLargest(arr);
        int res = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }
                if(arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,10,101};
        int largest = findLargest(arr);
        System.out.println(largest);

        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
}
