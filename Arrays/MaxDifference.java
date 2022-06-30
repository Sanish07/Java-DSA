package Arrays;
//Maximum Difference Problem with Order - Program to find maximum value of arr[j] - arr[i] such that j > i
public class MaxDifference {

    public static int naive(int[] arr){ //Complexity : O(n^2)
        int maxDiff = Integer.MIN_VALUE;
        if(arr.length == 1){
            return arr[0];
        }
        for(int j=arr.length-1;j>=0;j--){
            for(int i = j-1;i>=0;i--){
                if(arr[j] - arr[i] > maxDiff){
                    maxDiff = arr[j] - arr[i];
                }
            }
        }
        return maxDiff;
    }

    public static int maxDiffEff(int[] arr){ //Time Complexity O(n)
        int minNum = arr[0], maxSum = Integer.MIN_VALUE;
        if(arr.length == 1){
            return minNum;
        }
        for(int i=1;i<arr.length;i++){
            int currSum = arr[i] - minNum;
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(minNum > arr[i]){
                minNum = arr[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,8,10,3,4,1,10};
        System.out.println(naive(arr));
        System.out.println(maxDiffEff(arr));
    }

}
