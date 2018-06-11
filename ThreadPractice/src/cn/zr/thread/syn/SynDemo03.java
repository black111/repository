package cn.zr.thread.syn;

public class SynDemo03 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Thread proxy = new Thread(t1);
        proxy.start();
    }
}
class Test implements Runnable{
    Object goods = new Object();
    Object money  = new Object();
    @Override
    public void run() {
        while (true){
            test();
        }

    }
    public void test(){
        synchronized (goods){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (money){

            }
        }
        System.out.println("一手给钱");
    }
}
