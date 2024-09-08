//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        System.out.println("Lesson01be");
        System.out.println("------------------------------");


        System.out.println("Main start");
        Long timer1 = System.currentTimeMillis();

        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new Task());
        Thread thread3 = new Thread(new Daemon());
        thread3.setDaemon(true);

        //thread1.run();  // not correct
        thread1.start();
        thread2.start();
        thread3.start();


        for (int i = 1; i < 10 ; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Long timer2 = System.currentTimeMillis();
        System.out.println("Main finish" + (timer2 - timer1));
    }
}