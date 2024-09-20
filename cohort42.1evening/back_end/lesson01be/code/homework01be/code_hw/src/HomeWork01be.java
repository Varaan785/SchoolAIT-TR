/**
 * AIT-TR, Cohort 42.1, Back End, Lesson_01
 * @author Valerian
 * @version 29.07.2024
 * @Aufgabe Tasks: Дан диапазон чисел: от 1 до 2_000_000 включительно. Задача: найти,
 * сколько чисел из этого диапазона делятся нацело на 21.
 *
 * Решить данную задачу в один поток.
 * Решить данную задачу в два потока, разделив между потоками заданный диапазон чисел пополам.
 *
 * Естественно, результаты должны совпадать.
 * Попробуйте решить самостоятельно, если не получается подсказка на след. странице.
 *
 *  */
public class HomeWork01be {


    public static void main(String[] args) {

        int begin = 1;
        int ende = 2_000_000;
        int zähler = 0;


        for (int i = begin; i < ende; i++) {
            if (istAkzeptableZahl(i)) {
                zähler++;
            }
        }
        System.out.println("Ergebnis:" + zähler);
    }
private static boolean istAkzeptableZahl(int i) {
        return i % 21 == 0;
}
}
