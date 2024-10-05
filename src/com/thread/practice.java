package com.thread;

class Thread1 extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" -> "+Thread.currentThread().getId()+" -> "+i);
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" -> "+Thread.currentThread().getId()+" -> "+i);
        }
    }
}
public class practice{
    public static void main(String... args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        Thread.sleep(3000);
        System.out.println(t1.getState());
        Thread2 t = new Thread2();
        Thread t2 = new Thread(t);
        t2.start();
        t2.join();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+" -> "+Thread.currentThread().getId()+" -> "+i);
                }
            }
        });
        t3.start();
    }
}