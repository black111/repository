package cn.zr.threadtest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Date endTime = new Date(System.currentTimeMillis()+10*1000);
        long end =endTime.getTime();
        while (true){
//            输出
            System.out.println(new SimpleDateFormat("hh:mm:ss").format(endTime));
//            休眠
            Thread.sleep(1000);
//            构建下一秒的时间
            endTime = new Date(endTime.getTime()+1000);

            if(endTime.getTime() -10000> end){
                break;
            }


        }
    }
}
