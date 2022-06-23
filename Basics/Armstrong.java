package Basics;

import java.util.Scanner;

//To print all the 3 or less digit armstrong numbers upto 'n'
public class Armstrong {
    public static void printArm(int num) {
        int i = 100;
        while(i <= num){
            int curr = i;
            int sum = 0;
            while(curr != 0){
                int rem = curr % 10;
                sum += rem*rem*rem;
                curr /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printArm(n);
    }
}
