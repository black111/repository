package cn.zr.cn.zr.fanxing;

public class App {
    public static void main(String[] args) {
        Fruit f = new Apple();
    }
    //形参使用多态
    public static  void test(Fruit f){

    }
    //返回类型使用多态
    public static  Fruit test2(){
        return  new Apple();
    }
}
