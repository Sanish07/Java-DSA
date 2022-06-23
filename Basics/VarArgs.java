package Basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        pass("Hi","Hello","Go","Line");
    }

    public static void pass(String ...str) { //Works like rest operator of Js
        System.out.println(Arrays.toString(str));
    }
}
