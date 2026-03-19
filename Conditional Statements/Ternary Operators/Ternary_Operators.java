import java.util.*;

public class Ternary_Operators {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        String Type = (Number / 2 == 0)? "Odd" : "Even";

        System.out.println(Type);

    }
}