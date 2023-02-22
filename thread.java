public class thread {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());
        
        oddThread.start();
        evenThread.start();
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 30; i += 2) {
            System.out.println("Odd thread: " + i);
        }
    }
}

class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 30; i += 2) {
            System.out.println("Even thread: " + i);
        }
    }
}