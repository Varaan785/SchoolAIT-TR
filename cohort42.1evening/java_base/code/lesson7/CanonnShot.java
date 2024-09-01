package lesson7;
/**
 * AIT-TR cohort 42-1, Java Basic, Lesson #7
 * CanonnShot
 * @autor Valerian
 * @version 29.Jan.24
 */

import java.util.Random;
import java.util.Scanner;


public class CanonnShot {
    public static void main(String[] args) {
        // define using classes
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // define simple variables
        int damageRadius = 10;
        double g = 9.81;
        int angle;
        int speed;
        double difference;
        // generate distance to target
        double distance = random.nextInt(1000) + 100;
        do {
            // enter speed & angle
            System.out.println("Enter start speed (m/s):");
            speed = scanner.nextInt();
            System.out.println("Enter angle (°) [0..89°] :");
            angle = scanner.nextInt();
            // calculte
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle * 2)) / g;
             difference = distance - realDistance;
            // analise
            if (Math.abs(difference) < damageRadius) {
                System.out.println("You damage target");
            } else {
                if (distance < 0) {
                    System.out.println("Overshot: " + realDistance + ""  + distance);
                } else {
                    System.out.println("Fell short: " + realDistance + "" + distance);
                }
            }
        }while (Math.abs(difference) > damageRadius);
    }
}
