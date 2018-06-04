package cn.zr.cn.zr.fanxing;

public class FruitApp {
    public static void main(String[] args) {
//        A<Fruit> f =new A<Apple>();//错误
        A<Fruit> f = new A<Fruit>();


    }
    //形参使用多态
    public static  void test(A<Fruit> f){

    }
    //返回类型使用多态
    public static  A<Fruit> test2(){
//        return  new Apple();
        return null;
    }
}
