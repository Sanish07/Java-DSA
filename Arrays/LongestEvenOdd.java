package Arrays;

import java.util.Arrays;

//Program to find the longest subarray with alternate appearing Even-Odd Numbers.
public class LongestEvenOdd {

    public static int solution(int[] arr) {
        int maxSub = 1;
        int currSub = 1;
        for(int i=0;i< arr.length;i++){
          arr[i] = arr[i] % 2;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                currSub++;
                if(i == arr.length-1){
                    if(maxSub < currSub)
                        maxSub = currSub;
                }
            } else{
                if(maxSub < currSub)
                    maxSub = currSub;
                currSub = 1;
            }
        }

        return maxSub;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,9,8,7,6,5,5}; //Answer 6
        System.out.println(solution(arr));
    }
}
