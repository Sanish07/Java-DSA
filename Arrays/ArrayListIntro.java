package Arrays;
// Introduction To Arraylist
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //ArrayList<Integer> ar = new ArrayList<Integer>(10); // Using ArrayList as Fixed size array
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar);
    }
}
