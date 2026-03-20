import java.util.*;

public class if_else3 {
    public static void main(String args[]) {

        // Print if number of Odd or Even

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number %2 == 0) {
            System.out.println("This number is Even");
        }
        else {
            System.out.println("This number is Odd");
        }
    }
}