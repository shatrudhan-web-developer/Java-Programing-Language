import java.util.*;

public class else_if2 {
    public static void main(String args[]) {

        // Print the largest of 3 numbers

        int a = 1, b = 3, c = 6;

        if((a >= b) && (a >= c)) {
            System.out.println("Largest number of a");
        }
        else if(b >= c) {
            System.out.println("Largest number of b");
        }
        else {
            System.out.println("Largest number of c");
        }
    }
}