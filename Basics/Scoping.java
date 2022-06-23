package Basics;

public class Scoping {
    static int m = 50; // Shadowed at line 10
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            int m = 100; //Block scope
            System.out.println(m);
        }
        //System.out.println(m); //Not accessible outside the block
        for(int i=1;i<11;i++){ // i is in Loop scope
            System.out.print(i+" ");
        }
        //System.out.println(i); // Not accessible outside the loop
    }

    static void random(int x, int y){ //x and y are in method scope
        System.out.println(y);
    }
}
