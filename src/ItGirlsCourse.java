import itGirlsSchool.models.User;

public class ItGirlsCourse {

    private static int countOfUsers = 0;

    private static Object lock = new Object();

    public synchronized static void incrementCount () {
        countOfUsers++;
    }

    public static void main(String[] args) throws Throwable {

        User.registerNewUser("Thread:" + Thread.currentThread().getName() + ". User Main", "klsdfjsd", "a;erjWEIOJXL");
        Thread myThread1 = new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Waiting message....");
                    try {
                        lock.wait();
                        System.out.println("Message received");
                    } catch (InterruptedException e) {
                        System.out.println("Exception:(");
                        throw new RuntimeException(e);
                    }
                }
                User.registerNewUser(Thread.currentThread().getName() + " User Thread1", "klsdfjsd", "a;erjWEIOJXL");
                for (int i = 0; i < 1000; i++) {
                    incrementCount();
                }

                System.out.println("Count of users: " + countOfUsers);
            }
        };
        MyRunnable myRunnable = new MyRunnable();
        Thread myThreadRunnable = new Thread(myRunnable);

        Runnable myRunnable2 = () -> {
            User.registerNewUser("Thread:" + Thread.currentThread().getName() + ". User Runnable", "klsdfjsd", "a;erjWEIOJXL");
            for (int i = 0; i < 1000; i++) {
                incrementCount();
            }
            System.out.println("Count of users: " + countOfUsers);
        };

        Thread myThreadRunnable2 = new Thread(myRunnable2);
        myThread1.start();
        Thread.sleep(10000);
        myThreadRunnable.start();
        myThreadRunnable2.start();
        myThread1.join();
        myThreadRunnable.join();
        myThreadRunnable2.join();

        System.out.println("Count of users in the end: " + countOfUsers);






    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("Message send");
                lock.notify();
            }
        }
    }


}
