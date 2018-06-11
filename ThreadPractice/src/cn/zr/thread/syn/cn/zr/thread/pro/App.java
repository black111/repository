package cn.zr.thread.syn.cn.zr.thread.pro;

public class App {
    public static void main(String[] args) {
        Movie m =new Movie();

//        多线程
        Player p = new Player(m);
        Watch w = new Watch(m);
//        访问同一份资源
        new Thread(p).start();
        new Thread(w).start();
    }
}
