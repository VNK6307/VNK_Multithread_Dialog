public class Runner extends Thread {
    int threadSleep = 2500;
    static int runCounter = 0;

    @Override
    public void run() {
        try {
            runCounter++;
            while (!isInterrupted()) {
                Thread.sleep(threadSleep);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
            runCounter--;
            if (runCounter == 0) {
                System.out.println("Все потоки завершены.");
            }
        }
    }
}// class
