package lesson10;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #10
 *
 * @author Valerian
 * @version 5-Feb-2024
 */

public class Lesson10 {
    public static void main(String[] args) {
        // java compiler and JVM

        // variable simple types == 8
        int a = 25;
        int b = 12 * 3 + a;

        // logics
        boolean f = true; // false;
        boolean l = f && true; // && (and) || (ar) ! (not)

        // if-else // TODO optimize this block (may by)
        if (a == 3) {
            System.out.println("a = 3");
        } else {
            System.out.println("a !0 3");
        }
        String s = a == 3 ? "a =3" : "a != 3";  // ternary operator

        // switch
        switch (a) {
            case 1, 2, 3:
                System.out.println("a == 1 or 2 or 3");
                break;
            // case N:
            default:
                System.out.println("Alternative realaity");
        }

        // loops while, do while
        while (a < 10) {
            // TODO write loop body
            a++;
        }

        // loops for
        for (int i = 0, j = 4; i < 5; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
        }

        // array and for
        int[] arr = {4, 8, 1, 12, -3};
        arr[0] = -1;
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // using break && continue
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " ");
            if (i == 2) {
                //break;
                continue;
            }
            System.out.print(i + " ");

        }

        // method(s)
        int sum = add(5, 8);
        System.out.println(sum);
    }

    static  int add(int a, int b) {
        return a + b;
    }
}