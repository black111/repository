package cn.zr.threadtest;

/**
 * Thread.currentThread()静态方法
 * setName()
 * getName()
 * isAlive()
 */

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i =0 ;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread it= new MyThread();
        Thread proxy = new Thread(it,"挨踢");
        MyThread it2= new MyThread();
        Thread proxy2 = new Thread(it,"挨踢2");

        proxy.setPriority(Thread.MIN_PRIORITY);
        proxy2.setPriority(Thread.MAX_PRIORITY);
        proxy.start();
        proxy2.start();
        Thread.sleep(200);
        System.out.println(proxy.isAlive());

        System.out.println(proxy2.isAlive());
    }
}
