package lesson7;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #7
 *
 * @author Valerian
 * @version 29-Jan-2024
 */

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;


public class Lesson7 {
    public static void main(String[] args) {
        // create and init variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int number = random.nextInt(10);
            int counter = 0;
            int answer = -1;
            // main game loop
            while (answer != number && counter < 3) {
                counter++;
                System.out.println("Guess the umber [0..9]:");
                answer = scanner.nextInt();
                if (answer < number) {
                    System.out.println("Your number s less");
                } else if (answer > number) {
                    System.out.println("Your number is greater");
                }
            }
            // to show result of game
            if (answer == number) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE");
            }
            System.out.println("Play again? [1-yes, 0-no]");
        } while (scanner.nextInt() == 1);
    }
}
