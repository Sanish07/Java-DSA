package Basics;

import java.util.Scanner;

public class Functions {

    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        int a = 4;
        switch(a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not Matched");
        }

        int x,y;
        Scanner obj = new Scanner(System.in);
        x = obj.nextInt();
        y = obj.nextInt();
        System.out.println("Sum is : "+ Functions.sum(x,y));
    }
}
