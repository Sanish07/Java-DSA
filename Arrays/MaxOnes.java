package Arrays;
// Problem to find the maximum number of consecutive 1's in a binary array.
public class MaxOnes {
    public static int solution(int[] arr) {
        int result = 0;
        int tempCount = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 1)
                tempCount++;
            else {
                if (tempCount > result)
                    result = tempCount;
                tempCount = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,1,1,1,0,1,1,1,1,0,1};
        System.out.println(solution(arr));
    }
}
