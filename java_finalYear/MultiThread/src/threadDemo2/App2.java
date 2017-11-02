/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadDemo2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shahidkhan
 */
  class Runner2 implements Runnable{
      
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println("hello" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("threadDemo2.Runner.run()");
            }
        }
    }
}
public class App2 {
      public static void main(String[] args) {
          System.out.println("threadDemo2.App2.main()");
          Thread t1 = new Thread(new Runner2());
          Thread t2 = new Thread(new Runner2());
          t1.start();
          t2.start();
      }
}
