import java.util.*;

public class PassFail {
    public static void main(String args[]) {

        // Check if a  Students will Pass and Fail

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks = ");
        int marks = sc.nextInt();

        String Result = (marks <= 30) ? "Fail" : "Pass";

        System.out.println("This student is " + Result);
    }
}