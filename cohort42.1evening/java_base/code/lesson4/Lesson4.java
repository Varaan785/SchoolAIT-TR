package lesson4;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #4
 *
 * @author Valerian
 * @version 22-Jan-2024
 */


import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int a = scanner.nextInt();
//        System.out.println("Enter second number:");
//        int b = scanner.nextInt();
//        System.out.println("Result:");
//        System.out.println(a + " + " + b + " = " + (a + b));

        // class String
        String str = "Hello, Java";
        String ch = String.valueOf('a');
        String[] parts = str.split(" ");
        String s = 10 + " sm";
        System.out.println(str.substring(7) + 256 + " is great!");
    }
}

