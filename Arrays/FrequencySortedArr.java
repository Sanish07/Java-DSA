package Arrays;
// Program to find the frequencies of each unique number in a sorted array.
public class FrequencySortedArr {

    public static void solution(int[] arr){
        int currNum = arr[0], currFreq = 1;
        if(arr.length == 1){
            System.out.println(currNum + " "+currFreq);
            return;
        }

        for(int i=1;i<arr.length;i++){
            if(currNum != arr[i]){
                System.out.println(currNum + " "+currFreq);
                currNum = arr[i];
                currFreq = 1;
            } else {
                currFreq++;
            }
        }
        System.out.println(currNum + " " +currFreq);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,10,20,20,20,40,50,100,100,100};
        solution(arr);
    }
}
