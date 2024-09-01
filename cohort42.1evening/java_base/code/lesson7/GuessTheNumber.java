package lesson7;
/**
 * AIT-TR cohort 42-1, Java Basic, Lesson #7
 * GuessTheNumber
 * @autor Valerian
 * @version 3.Feb.2024
 */
import java.util.Random;
import java.util.Scanner;



public class GuessTheNumber {
    public static void main(String[] args) {
        // create and init variable
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int number = random.nextInt(10);
            int counter = 0;
            int answer = -1;
            // main game loop
            while (answer != number && counter < 3) {
                counter++;
                System.out.println("Guess the number [0..9]:");
                answer = scanner.nextInt();
                if (answer < number) {
                    System.out.println("Your number is less");
                } else if (answer > number) {
                    System.out.println("Your number is greater");
                }
            }
            //to show result of game
            if (answer == number) {
                System.out.println("your WIN!");
            } else {
                System.out.println("Your LOSE!");
            }
            System.out.println("Play again [1-yes, 0-no]");
        } while (scanner.nextInt() == 1);



    }
}
