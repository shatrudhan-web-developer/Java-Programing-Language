import java.util.*;

public class MakingCalculator {
    public static void main(String args[]) {

        // Makinng normal Calculator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int number2 = sc.nextInt();

        System.out.print("Enter Operator = ");
        char Operator = sc.next().charAt(0);

        switch(Operator) {
            case '+' : System.out.println("Addition = " + (number1 + number2));
                        break;

            case '-' : System.out.println("Subtraction = " + (number1 - number2));
                        break;

            case '*' : System.out.println("Multiplication = " + (number1 * number2));
                        break;

            case '/' : System.out.println("Deviding = " + (number1 / number2));
                        break;

            case '%' : System.out.println("Modelas = " + (number1 % number2));
                        break;

            default : System.out.println("Not Support");
        }
    }
}