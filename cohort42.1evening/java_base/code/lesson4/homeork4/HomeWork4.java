package lesson4.homeork4;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #4
 *
 * @author Valerian
 * @version 23-Jan-24
 */
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String v = scanner.next();
        System.out.println("What is your last name? ");
        String k = scanner.next();
        System.out.println("In which city you live? ");
        String b = scanner.next();
        System.out.println("How old are you? ");
        String t = scanner.next();
        System.out.println("What is your height? ");
        String o = scanner.next();
        System.out.println("My name is " + v + " " + k + ", " + "i live in " + b + ", " + "Im " + t + " years old," + " my height is " + o + " meters.");
    }
}
