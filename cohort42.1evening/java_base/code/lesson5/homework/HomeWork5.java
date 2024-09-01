package lesson5.homework;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #5
 *
 * @author Valerian
 * @version 27-Jan-24
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;



import jdk.jshell.ImportSnippet;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        //Task #1
        System.out.println("task #1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int va = scanner.nextInt();
        System.out.println("Enter second number: ");
        int vb = scanner.nextInt();
        boolean a = va % 2 == 0;
        boolean ab = vb % 2 == 0;
        boolean b = va % 3 == 0;
        boolean ba = vb % 3 == 0;
        boolean c = a && b;
        boolean ca = ab && ba;
        System.out.println("Number: " + va + " even: " + a + "; multiple 3: " + b + "; even and multiple 3: " + c);
        System.out.println("Number: " + vb + " even: " + ab + "; multiple 3: " + ba + "; even and multiple 3: " + ca);

        //Task #2
        System.out.println("task #2");
        System.out.println("Choose a number from one to three (1, 2, or 3): ");
        int number = scanner.nextInt();
        String[] words = {"unavailable", "One", "Two", "Three"};
        String result = (number >= 1 && number <= 3) ? words[number] : words[0];
        System.out.println(" Your result: " + result);

        //Task #3
        System.out.println("task #3");
        Random random = new Random();
        int na = random.nextInt(101);
        int nb = random.nextInt(101);
        int nc = random.nextInt(101);
        int nd = random.nextInt(101);
        System.out.println( + na + ", " + nb + ", " + nc + ", " + nd + ";");
        int maxNum = Math.max(Math.max(na, nb), Math.max(nc, nd));
        System.out.println("Result " + maxNum);
    }
}


