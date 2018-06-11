package cn.zr.threadtest;

/**
 * 创建多线程，继承Thread，重写run方法
 */
public class ThreadPra extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("跑了"+i +"步");
        }
    }

    public static void main(String[] args) {
//        新生线程
        Thread t1=new Thread();
        Thread t2= new Thread();
//        启动线程
        t1.start();
        t2.start();
    }
}
