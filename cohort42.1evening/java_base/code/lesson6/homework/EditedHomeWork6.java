package lesson6.homework;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #6
 *
 * @author Valerian
 * @version 3-Feb-24
 */
import java.util.Scanner;



public class EditedHomeWork6 {
    public static void main(String[] args) {

        // task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3:");
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
                System.out.println("Wrong number!");

                // task #2
                int day = 5;
                switch (day) {
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
                    case 5:
                        System.out.println("Friday");
                    case 6:            //case 6,7:
                    case 7:
                        System.out.println("Weekend");
                        break;
                    default:
                        System.out.println("Inavalid day of week number");

                        // task #3
                        int i = 1;
                        while (i < 11) {
                            System.out.println("Task +" + i);
                            i++;

                        }

                        // task #4
                        int count = 0;
                        do {
                            count++;
                            if (count %5 == 0) {
                                System.out.println(count);
                            }
                        } while (count < 100);

                        // task #5
                        count = 0;
                        String word = "";
                        do {
                            System.out.println("Say 'hello' and come in:");
                            word = scanner.nextLine();
                        } while (!word.equals("hello"));   // } while (!word.equalsIgnoreCasse("Hello")
                        System.out.println("Hello, friend!");

                }
        }
    }
}
