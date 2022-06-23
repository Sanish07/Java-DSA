package Basics;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean check(int num){
        if(num == 1) return false;
        int c = 2;
        while(c*c <= num){
            if(num % c == 0) return false;
            c++;
        }
        return c*c > num;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(check(n));
    }
}
