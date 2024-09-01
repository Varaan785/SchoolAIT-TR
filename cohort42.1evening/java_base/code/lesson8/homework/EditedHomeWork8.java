package lesson8.homework;

/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #25
 * @author Valerian
 * @version 13-Feb-34
 */
import java.util.Arrays;
import java.util.Random;



public class EditedHomeWork8 {
    public static void main(String[] args) {

        // task #1
        for (int i = 1; i < 11; i++) {
            System.out.println("Task" + i);
        }

        // task#2
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        for (int i : a) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // task #3
        String[] s = {"One", "Two", "Twenty", "Three"};
        String strMaxLength = "";
        for (String str : s) {
            if (str.length() > strMaxLength.length()) {
                strMaxLength = str;
            }
        }
        for (char chr : strMaxLength.toCharArray()) {
            System.out.println(chr);
        }

        // task #4
        Random random = new Random();
        int[] n = new int[100];
        int max = n[0];
        int min = n[0];
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(100);
        }
        // execute array
        for (int i : n) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max =" + max + ", min =" + min + ", average =" + (sum / (double) n.length) + "  " + (sum / n.length));

        // task5
        String exp = "16 + 23-123+8";
        String[] tokens = new String[10];
        int idx = 0;
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '*', '/':
                    tokens[idx] = number;
                    tokens[ idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = "";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
