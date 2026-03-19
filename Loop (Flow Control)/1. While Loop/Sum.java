import java.util.*;

public class Sum {
    public static void main(String args[]) {

        // Print sum of first n natural numbers.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is : " + sum);
    }
}