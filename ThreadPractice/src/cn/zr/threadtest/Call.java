package cn.zr.threadtest;

import java.util.concurrent.*;

public class Call  {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

            ExecutorService exe = new ScheduledThreadPoolExecutor(2);
            Race l =new Race("tortoise",1000);
            Race r = new Race("rabbit",500);
    //        获取返回值
            Future<Integer> res1 = exe.submit(l);
            Future<Integer> res2 = exe.submit(r);

            Thread.sleep(4000);//跑4秒就停
            l.setFlag(false);
            r.setFlag(false);
            System.out.println("乌龟跑了"+ res1.get()+"步");
            System.out.println("兔子跑了"+ res2.get()+"步");
    //        停止服务
            exe.shutdownNow();

    }
}
class Race implements Callable<Integer>{
    private String name;
    private  long time;
    private boolean flag = true;
    private int step = 0;//步

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Race(String name) {
        super();
        this.name = name;
    }
    public Race(String name,long time) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws InterruptedException {
        while (flag){
            Thread.sleep(time);//延时
            step++;
        }
        return step;
    }
}
