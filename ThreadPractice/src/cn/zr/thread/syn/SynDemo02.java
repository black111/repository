package cn.zr.thread.syn;

/**
 * 单例设计模式，确保一个类只有一个对象
 * @author lively
 */
public class SynDemo02 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
    }
}
/**单例设计模式
 * 懒汉式 double checking(线程安全提高效率的双重检查)
 * 1、构造器私有化，避免外部直接构造对象
 *2、声明一个私有静态变量
 * 3创建一个对外的公共的静态方法访问改变量，如果变量没有对象，创建该对象
 * */
class Jvm{
//声明一个私有静态变量
    private static Jvm instance = null;
//    private static Jvm instance1 =new Jvm();//饿汉式
    //    构造器私有化，避免外部直接构造对象
    private Jvm(){

    }
//    创建一个对外的公共的静态方法访问改变量，如果变量没有对象，创建该对象
    public static Jvm getInstance(){
        if (null ==  instance){
            synchronized (Jvm.class){
                if(null == instance){
                    instance = new Jvm();
                }
            }
        }
        return instance;
    }
}

/**
 * 饿汉式单例模式
 * 1、构造器私有化，避免外部直接构造对象
 * 2、在声明私有静态变量时就创建对象
 * 3、对外提供访问属性的静态方法
 */
class Jvm2{
    //构造器私有化
    private Jvm2(){

    }
    //在声明私有静态变量时就进行实例化
    private static Jvm2 instance1 =new Jvm2();//饿汉式
    //  创建一个对外的公共静态方法进行实例化
   public static  Jvm2 getInstance(){
       return Jvm2.getInstance();
   }
}

/**
 * 提高饿汉式的效率
 * 类在使用的时候加载，延缓加载时间
 */
class Jvm3{
    private static class JVMholder{
        private static Jvm3 instance =new Jvm3();
    }
    private Jvm3(){

    }

    //  创建一个对外的公共静态方法进行实例化
    public static  Jvm3 getInstance(){
        return JVMholder.instance;
    }
}