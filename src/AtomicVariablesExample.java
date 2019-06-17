/**
 * this example is based off of the tutorial found here
 * https://www.youtube.com/watch?v=IQSbIOKhC4g
 */

public class AtomicVariablesExample {
  private volatile int val = 0;
  private int MAX = 30;

  public void playPingPong() {
    new Thread(() -> {
      for (int lv = val; lv < MAX; )
        if(lv != val) {
          System.out.println("pong(" + val + ")");
          lv = val;
        }
    }).start();

    new Thread(() -> {
      for (int lv = val; lv < MAX; ) {
        val = ++lv;
        System.out.println("ping(" + lv + ")");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }

    }).start();


  }

}
