/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author Shahidkhan
 */
public class App3 {
    public static void main(String[] args)
    {
        System.out.println("demo3.App3.main()");
        Thread t3 = new Thread(new Runnable() {
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
        });
        t3.start();
    }
    
}
