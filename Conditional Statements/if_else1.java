import java.util.*;

public class if_else1 {
    public static void main(String args[]) {

        //Example of if else

        int age = 16;

        if(age >= 18) {
            System.out.println("Adult");
        }
        if(age >= 13 && age < 18) {
            System.out.println("Teenger");
        }
        else {
            System.out.println("Child");
        }
    }
}