package lesson3.homeWork3;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #3
 *
 * @author Valerian
 * @version 22-Jan-24
 */

public class EditedHomeWork3 {
    public static void main(String[] args) {
        // task #1
        System.out.println("task #1");
        int n1 = 0, n2 = 1, n3 = 2, n4 = 3, n5 = 4, n6 = 5, n7 = 6, n8 = 7, n9 = 8, n10 = 9;
        int sum = (n1 + n2 + n3 + n4 + n5  + n6  + n7 + n8 + n9 + n10);
        int average = sum / 10;
        double averageDouble = sum / 10.;
        System.out.println("Average =" + averageDouble);

        // task #2
        System.out.println("task #2");
        int productV = 1000;
        int productW = 500;
        int total = productV + productW;
        double discount = total / 10.;
        System.out.println("Discount = " + discount + "total = " + (total - discount));

        // task #3
        System.out.println("task #3");
        averageDouble = (1 + 0 + -1 + -2 + -1 + -2 + 7) / 7d;
        System.out.println("Average t = " + averageDouble);

        // task #4
        System.out.println("task #4");
        int a = 9 % 2;
        int b = 10 % 2;
        int c = 11 % 2;
        System.out.println(a + "," + b + "," + c);
        System.out.println((9 % 3) + "," + (10 % 3) + "," + (11 % 3) + "," + (12 % 3));

        // task #5
        System.out.println("task #5");
        int x = 3;
        //x++;
        x += x++;
        System.out.println(x);
    }
}
