package com.thread;

public class BrickUnLoading {
    public static void main(String... args) throws InterruptedException
    {
        BrickDairy bd = new BrickDairy();
        Runnable r1 = () -> {
            for(int i=0;i<1000;i+=50)
            {
                bd.incrementBrick();
            }
        };
        Runnable r2 = () -> {
            for(int i=0;i<2000;i+=50)
            {
                bd.incrementBrick();
            }
        };
        Runnable r3 = () -> {
            for(int i=0;i<3000;i+=50)
            {
                bd.incrementBrick();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.print(bd.count);
        System.out.print(bd.count2);


    }
}
class BrickDairy{
    int count = 0;
    int count2 = 0;
//    public synchronized void incrementBrick(){
//        count += 50;
//    }
    public void incrementBrick(){
        //it will work only for the specific block;
        synchronized (this){
            count += 50;
        }
        count2 += 50;
    }
}
