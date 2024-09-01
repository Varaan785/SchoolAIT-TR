package lesson6;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #6
 * Calculator6
 * @author Valerian
 * @version 26-Jan-2024
 */

import java.util.Scanner;

public class Calculator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 4 +/-/*/: 3:");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        switch (s) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
            case "-":
                System.out.println(a + " + " + b + " = " + (a - b));
            case "*":
                System.out.println(a + " + " + b + " = " + (a * b));
            case ":":
                System.out.println(a + " + " + b + " = " + (a / b));
            default:
                System.out.println("Error: unknow operation:" + s);
        }
        //    if (s.equals("+")) {
        //        System.out.println(a + " + " + b + " = " + (a + b));
        //    } else if (s.equals("-")) {
        //        System.out.println(a + " - " + b + " = " + (a - b));
        //    } else if (s.equals("*")) {
        //        System.out.println(a + " * " + b + " = " + (a * b));
        //    } else if (s.equals(":")) {
        //        System.out.println(a + " : " + b + " = " + (a / b));
        //    } else {
        //        System.out.println("Error: unknown action: " + s);
//            }
    }
}


