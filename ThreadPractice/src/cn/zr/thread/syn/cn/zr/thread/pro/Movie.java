package cn.zr.thread.syn.cn.zr.thread.pro;

/**
 * 一個場景，共同的资源
 * 生产者消费者模式，信号灯法
 * wait()
 */
public class Movie {
    private String pic;

//    信号灯
//    flag -->T生产者生产，消费者等待，生产完成后通知消费者
//    flag -->F 消费者消费，生产者等待，消费完成后通知生产者

    private boolean flag = true;
    public synchronized void play(String pic){
        if (!flag){//生产者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        开始生成
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        生产完毕
        System.out.println("生产了："+pic);
        this.pic = pic;
//        通知消费
        this.notify();
//        生产者停下
        this.flag = false;
    }
    public synchronized void watch(){
        if(flag){//消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        开始消费
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        消费完毕
        System.out.println("消费了了："+pic);
//        通知生产
        this.notifyAll();
//        消费者停下
        this.flag = true;

    }
}
