package Arrays;
// Stock Buy And Sell Problem, program to find maximum profit in buying and selling of stocks on different days.
public class StockBS {

    public static int solution(int[] arr) {
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,8,1,0,0,3,8,5,6,6,10};
        System.out.println("Maximum profit is : "+solution(arr));
    }
}
