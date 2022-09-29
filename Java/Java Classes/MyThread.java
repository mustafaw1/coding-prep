package Classprep;

public class MyThread {
  static int counter = 0;

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(() -> {
      for (int i = 0; i < 10000; ++i) {
        MyThread.counter++;
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 10000; ++i) {
        MyThread.counter++;
      }
    });
    t.start();
    t2.start();
    t.join();
    t2.join();
    System.out.println("counter = " + counter);
  }
}
