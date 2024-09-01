package lesson5;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #5
 *
 * @author Valerian
 * @version 23-Jan-2024
 */

import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {
        int n = 8;
        boolean v = n % 2 ==0;
        boolean w = n % 3 ==0;
        boolean c = v && w; // boolean AND -> &&, boolean OR -> ||, boolean NOT -> !
        System.out.println(v+ "," + w +"," + c);

        System.out.println(Math.random());

        Random random = new Random();
        System.out.println(random.nextInt(101));

        String str = "2356";
        System.out.println(str.length());
        System.out.println(str.charAt(0));


        boolean a = 4 > 5;
        System.out.println(a);
        int t = -3;
        System.out.println(t < 3);
        if (t <= 0) {
            System.out.println("It´s frost");
    } else {
            System.out.println("It´s NO frost.");
        }
        //String str = new String("Hello");
        if (str.equals("Hello")) {
            System.out.println("ok");
        } else {
            System.out.println("NOT ok");
        }
        {
            int b = 55;
            System.out.println(b * 2);
        }
        int b = 3;
        System.out.println(b);
    }
}