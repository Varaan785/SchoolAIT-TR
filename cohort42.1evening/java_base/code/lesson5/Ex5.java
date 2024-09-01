package lesson5;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #5
 * Ex5
 * @author Valerian
 * @version 23-Jan-2024
 */

public class Ex5 {
    public static void main(String[] args) {
        int t = 12;
        if (t > 28) {
            System.out.println("It´s Hot");
        } else {
            System.out.println("It´s NOT Hot");
        }

        System.out.println(t > 28? "It´s" : "It´s NOT hot");
    }
}