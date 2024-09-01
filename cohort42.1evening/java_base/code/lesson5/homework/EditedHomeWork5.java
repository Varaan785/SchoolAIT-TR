package lesson5.homework;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #5
 *
 * @author Valerian
 * @version 28-Jan-24
 */
import java.util.Random;

public class EditedHomeWork5 {
    public static void main(String[] args) {
        // task #1
        System.out.println("task #1");
        int n = 345;
        boolean a = n % 2 == 0;
        boolean b = n % 3 == 0;
        boolean c = a && b;
        System.out.println(" Number " + n + " div by 2: " + a + ", div by 3: " + b + ", dib by 2 and div by3: " + c);

        // task #2
        System.out.println("task #2");
        n = 3;
        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Wrong number");
        }

        // task #3
        System.out.println("task #3");
        Random random = new Random();
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n12 = n1 < n2? n2 : n1;
        int n34 = n3 < n4? n4 : n3;
        int max = n12 < n34? n34 : n12;
        System.out.println(n1 + "," + n2 + "," + n3 + "," + n4 + ", max:" + max);

        // task #4
        System.out.println("task #4");
        String str = "4381";
        if (str.length() == 4) {
            n1 = str.charAt(0) - '0';
            n2 = str.charAt(0) - '0';
            n3 = str.charAt(0) - '0';
            n4 = str.charAt(0) - '0';
            System.out.println(n1 + n2 == n3 + n4 ? "lucky number" : "unlucky number");
        } else {
            System.out.println("Wrong input" + str);
        }
    }
}




