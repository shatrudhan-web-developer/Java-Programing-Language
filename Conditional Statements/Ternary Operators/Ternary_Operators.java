import java.util.*;

public class Ternary_Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = sc.nextInt();

        String Type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("This number is " + Type);
    }
}