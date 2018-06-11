package cn.zr.threadtest;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        cn.zr.threadtest.ThreadPra t= new cn.zr.threadtest.ThreadPra();
//        Tortoise t1=new Tortoise();
//        t1.start();
//        t.start();
        Ticket web12306 = new Ticket();
        Thread t1 = new Thread(web12306,"t1");
//      合并线程
//      t1.join();
//        暂停当前线程
//        Thread.yield();
        Thread t2 = new Thread(web12306,"t2");
        Thread t3 = new Thread(web12306,"t3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("优先级："+t1.getPriority());
    }
}
