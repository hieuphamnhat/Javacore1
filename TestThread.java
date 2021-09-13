public class TestThread {

    public static void main(String[] args) {
        // Tạo ra luồng myThread0 từ lớp MyThread
        MyThread myThread0 = new MyThread();
        myThread0.start(); // kích hoạt luồng

        // Tạo ra luồng myThread1 từ lớp MyThread
        MyThread myThread1 = new MyThread();
        myThread1.start();

        // Tạo ra luồng myThread2 từ lớp MyThread
        MyThread myThread2 = new MyThread();
        myThread2.setName("Luồng 2"); // thay đổi tên luồng thành Luồng 2
        myThread2.start();

        SleepJoin thread1 = new SleepJoin();
        thread1.setName("Thread 1");
        thread1.start(); // khởi chạy thread 1
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SleepJoin thread2 = new SleepJoin();
        thread2.setName("Thread 2");
        thread2.start(); // khởi chạy thread2
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SleepJoin thread3 = new SleepJoin();
        thread3.setName("Thread 3");
        thread3.start(); // khởi chạy thread3
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}