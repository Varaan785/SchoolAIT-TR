package lesson6.homework;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #6
 *
 * @author Valerian
 * @version 28-Jan-24
 */
import java.util.Scanner;



public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // task #1
        System.out.println("Ener 1 ,2 ,3:");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number");
        }

        // task #2
        System.out.println("choose a number from 1 to 7");
        {
            int Day = scanner.nextInt();
            switch (Day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("have a nice weekend");
            }
                    // task #3
//            int Task1;
//            int Task2;
//            int Task3;
//            int Task4;
//            int Task5;
//            int Task6;
//            int Task7;
//            int Task8;
//            int Task9;
//            int Task10;
//            System.out.println("while i++");
//            Task1 = 1;
//            while (Task1 <= Task10) {
//                System.out.println(Task);
        }
    }
}


