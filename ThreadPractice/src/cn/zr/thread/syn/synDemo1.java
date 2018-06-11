package cn.zr.thread.syn;

public class synDemo1 implements Runnable{
    private int num= 50;
    @Override
    public void run() {
        while (true){
            if (num<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
        }
    }
    public static void main(String[] args) {
        synDemo1 t= new synDemo1();
        Thread t1 = new Thread(t,"路人甲");
        Thread t2= new Thread(t,"黄牛");
        Thread t3 = new Thread(t,"程序员");//线程新生
        t1.start();//线程就绪
        t2.start();
        t3.start();
    }
    public void Test1(){
        if (num<0){

        }
    }
}
