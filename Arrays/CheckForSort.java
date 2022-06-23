package Arrays;
// Program to find whether an array is sorted or not
public class CheckForSort {
    public static boolean solution(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,6,8};
        System.out.println(solution(arr));
    }
}
