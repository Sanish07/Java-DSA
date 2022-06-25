package Arrays;
// Problem to find the leader numbers in an array
public class LeadersArr {

    public static void solutionNaive(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(arr[i]);
        }
    }

    public static void leaderEff(int[] arr) {
        if(arr.length == 0){
            return;
        }
        int n = arr.length;
        int highest = arr[n-1];
        System.out.println(arr[n-1]);
        for(int i = n-2; i>=0; i--){
            if(arr[i] > highest){
                highest = arr[i];
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,10,4,6,1,10,9,3,2};
        solutionNaive(arr);
        System.out.println();
        leaderEff(arr);
    }
}
