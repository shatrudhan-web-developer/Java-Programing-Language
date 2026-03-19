import java.util.*;

public class PassFail {
    public static void main(String args[]) {

        // Check if a  Students will Pass and Fail

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks = ");
        int marks = sc.nextInt();

        String Result = (marks <= 30) ? "Pass" : "Fail";

        System.out.println("This student is " +Result);
    }
}