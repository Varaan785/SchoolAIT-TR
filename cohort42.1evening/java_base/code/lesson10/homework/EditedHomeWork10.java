package lesson10.homework;
/**
 * AIT-TR cohort 42-1, Java Basic, hw #10
 * @autor Valerian
 * @version 6.Feb.2024
 */

public class EditedHomeWork10 {
    public static void main(String[] args) {
        HomeWork(9);
        Edited(9);

    }
    static void HomeWork(int n) {
        for (int i = 3; i <= n; i++) {
            System.out.println("HomeWork" + i + " Rady");

        }
    }
    static void Edited(int n) {
        for (int i = 3; i <= n; i++) {
            System.out.println("Located in HomeWorkEdited" + i);

        }
    }
}
