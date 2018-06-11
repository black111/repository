package cn.zr.thread.syn.cn.zr.thread.pro;

/**
 * 消费者
 */
public class Watch implements Runnable {
    private Movie m;
    public Watch(Movie m){
        super();
        this.m=m;
    }
    @Override
    public void run() {
        for(int i= 0;i<10 ;i++){
            m.watch();
        }

    }
}
