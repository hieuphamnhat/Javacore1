public class SleepJoin extends Thread {
    public void run() {
        super.run();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            System.out.println("5000 milliseconds and next Thread");
            if (i == 5) {
                System.out.println("Kết thúc!");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " run.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End " + Thread.currentThread().getName());
    }
}
