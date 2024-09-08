//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int counter = 0;

    public static void main(String[] args) {


            System.out.println("Lesson01be_2");
            System.out.println("-----------------");

            Thread thread1 = new Thread(new Task(1_000_000));
            Thread thread2 = new Thread(new Task(1_000_000));
            Thread thread3 = new Thread(new Task(1_000_000));
            Thread thread4 = new Thread(new Task(1_000_000));

            Thread[] threads = {thread1,thread2,thread3,thread4};
            for (int j = 0; j < threads.length; j++) {
                threads[j].start();
            }
            for (int j = 0; j < threads.length; j++) {
                try {
                    threads[j].join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        System.out.println(counter);
        }
        public static void add() {
        counter++;
    }

    }


