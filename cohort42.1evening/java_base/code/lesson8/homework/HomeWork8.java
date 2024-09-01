package lesson8.homework;

/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #8
 * @author Valerian
 * @version 6-Feb-24
 */
import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {

        // task #1
        int Task;
        for (Task = 1; Task < 11; Task = Task + 1)
            System.out.println("Task:" + Task);

        // task #2
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print(Arrays.toString(array));
        for (int i : array) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        // task #3

    }}

