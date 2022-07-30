package Arrays;
//Program to find the units of water that can be stored/trapped within a given set of bars.

public class TrapRainwater {
    public static int solution(int[] arr) {
        int capacity = 0;
        for(int i=1; i<arr.length-1;i++){
            int main;
            int lMax = arr[i-1];
            int rMax = arr[i+1];
            for(int j=i-2;j>=0;j--){
                if(arr[j]>lMax){
                    lMax = arr[j];
                }
            }
            for(int j=i+2;j<arr.length;j++){
                if(arr[j]>rMax){
                    rMax = arr[j];
                }
            }
            main = (lMax >= rMax) ? rMax : lMax;
            capacity += main - arr[i];
        }
        return capacity;
    }

    public static int solEff(int[] arr){
        int capacity = 0;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];

        lMax[0] = arr[0];
        rMax[arr.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length-1;i++){ //For lMax Iteration
            if(arr[i] > lMax[i-1]){
                lMax[i] = arr[i];
            } else{
                lMax[i] = lMax[i-1];
            }
        }

        for(int i=arr.length-2;i>=0;i--){ //For rMax Iteration
            if(arr[i] > rMax[i+1]){
                rMax[i] = arr[i];
            }
            else{
                rMax[i] = rMax[i+1];
            }
        }

        for(int i=1;i<arr.length-1;i++){
            int min = (lMax[i] > rMax[i]) ? rMax[i] : lMax[i];
            capacity += min - arr[i];
        }

        return capacity;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1,2,5};
        System.out.println(solution(arr));

        System.out.println(solEff(new int[]{3,0,1,2,5}));
    }
}
