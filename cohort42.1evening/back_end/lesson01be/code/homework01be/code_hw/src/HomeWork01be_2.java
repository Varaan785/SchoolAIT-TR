public class HomeWork01be_2 {
    public static void main(String[] args) throws InterruptedException {
        int start = 1;
        int end = 2_000_000;
        int mid = (start + end) / 2;

        CounterThread thread1 = new CounterThread(start, mid);
        CounterThread thread2 = new CounterThread(mid + 1, end);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int totalCount = thread1.getCount() + thread2.getCount();
        System.out.println("Count of numbers divisible by 21: " + totalCount);
    }
}

class CounterThread extends Thread {
    private int start;
    private int end;
    private int count;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 21 == 0) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }
}