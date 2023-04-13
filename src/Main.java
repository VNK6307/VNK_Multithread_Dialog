public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        int mainSleep = 15000;
        ThreadGroup simplyGroup = new ThreadGroup("Simply Group");

        Thread myThread1 = new Thread(simplyGroup, new Runner(), "поток 1");
        Thread myThread2 = new Thread(simplyGroup, new Runner(), "поток 2");
        Thread myThread3 = new Thread(simplyGroup, new Runner(), "поток 3");
        Thread myThread4 = new Thread(simplyGroup, new Runner(), "поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(mainSleep);
        Thread.currentThread().getThreadGroup().interrupt();
    }// main
}