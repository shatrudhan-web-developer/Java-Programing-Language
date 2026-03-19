import java.util.*;

public class Infinitive {
    public static void main(String args[]) {

        // Printed number from 1 to n

        Scanner sc = new Scanner(System.in);

        System.out.print("Here counting from 1 to ");
        int number = sc.nextInt();

        int i = 1;

        while(i <= number) {
            System.out.println(i);
            i++;
        }
    }
}