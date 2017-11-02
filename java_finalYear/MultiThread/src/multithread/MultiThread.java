/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shahidkhan
 */
class Runner extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        for(int i=0; i<10; i++)
        {
            System.out.println("hello" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("multithread.MultiThread.");
        Runner r = new Runner();
         Runner r2 = new Runner();
        r.start();
        r2.start();
    }
    
}
