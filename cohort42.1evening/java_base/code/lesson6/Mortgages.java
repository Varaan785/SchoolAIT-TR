package lesson6;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #6
 * Mortgages
 * @author Valerian
 * @version 26-Jan-2024
 */

public class Mortgages {
    public static void main(String[] args) {
        float total = 200000;
        float payment = 1000;
        float percent = 4; // %
        int monthCount = 0;
        do {
            monthCount++;
//            if(monthCount % 12 == 0) {
//                total = total + total/100*percent;
//
//            }
            total =total - payment;
        } while (total > 0);
        System.out.println(monthCount);
    }
}
