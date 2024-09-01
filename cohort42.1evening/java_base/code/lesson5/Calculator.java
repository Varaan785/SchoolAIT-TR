package lesson5;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #5
 * Calculator
 * @author Valerian
 * @version 24-Jan-2024
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 4 +/-/*/: 3:");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        if (s.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (s.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (s.equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (s.equals(":")) {
            System.out.println(a + " : " + b + " = " + (a / b));
        } else {
            System.out.println("Error: unknown action: " + s);
        }
    }
}
