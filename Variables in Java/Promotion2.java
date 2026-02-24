// import java.util.*;

// public class Promotion2 {
//     public static void main(String args[]) {

//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
        
//         double ans = a + b + c + d;
//         System.out.println(ans);
//     }
// }

            //Wrong & Right

import java.util.*;

public class Promotion2 {
    public static void main(String args[]) {

        byte b = 5;
        b = (byte)(b*2);            // ===> Right
        // b = b*2;                 // ===> Wrong

        System.out.println(b);
    }
}