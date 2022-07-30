package Arrays;
// Program to Find Subarray having maximum sum of elements
public class MaxSumSubArr {

    public static int solution(int[] arr) {
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            int tempSum = 0;
           for(int j=i;j<arr.length;j++){
               tempSum += arr[j];
           }
           if(tempSum > maxSum)
               maxSum = tempSum;
        }
        return maxSum;
    }

    public static int solEff(int[] arr) {
        int maxSum = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] + arr[i-1] > arr[i])
                arr[i] = arr[i] + arr[i-1];
        }

        for(int i=0;i< arr.length;i++){
            if(maxSum < arr[i])
                maxSum = arr[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-3,8,-2,4,-5,6};
        System.out.println(solution(arr));
        System.out.println(solEff(arr));
    }
}
