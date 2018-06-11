package cn.zr.threadtest;

class Tortoise extends  Thread{
    public void run(){
        for(int i = 0 ;i<10;i++){
            System.out.println("乌龟跑了"+i+"步");
        }
    }
}
