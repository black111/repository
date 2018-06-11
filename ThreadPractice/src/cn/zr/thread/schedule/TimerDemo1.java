package cn.zr.thread.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer
 * 任务调度
 * 后期：quartz框架
 */

public class TimerDemo1{
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哈哈....");
            }
        },new Date(System.currentTimeMillis()+1000), 2000);
    }

}
