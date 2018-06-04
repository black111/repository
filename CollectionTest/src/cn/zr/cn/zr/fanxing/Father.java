package cn.zr.cn.zr.fanxing;

public abstract class Father<T1,T2> {
    T1 name;
    public abstract void test(T1 t);
}
/**
 *父类为泛型类
 * 1、属性
 * 2、方法
 * 子类声明时指定具体细节
 * 属性类型为具体类型
 * 方法同理
 * 不能子类擦除，父类泛型
 * 1、属性类型
 *父类中，随父类而定
 * 子类中，随子类而定
 * 2、方法重写
 * 随父类而定
 */
class Child extends Father<String,Integer>{
    String t2;

    @Override
    public void test(String s) {

    }
}

/**
 * 子类为泛型类>=父类泛型
 * @param <T1>
 * @param <T2>
 */
class Child2<T1,T2> extends Father<T1,T2>{
    @Override
    public void test(T1 t) {

    }
}

/**
 * 子类为泛型类，父类不指定类型，泛型的擦除，使用object替换
 * @param <T1>
 * @param <T2>
 */
class Child3<T1,T2> extends Father{
    T1 t2;

    @Override
    public void test(Object o) {

    }
}

/**
 * 子类与父类同时擦除
 */
class Child4 extends Father{
    String name;

    @Override
    public void test(Object o) {

    }
}
/**
 * 子类为泛型类父类擦除错误
 */

//class Child5 extends Father<T>{
//    String name;
//
//    @Override
//    public void test(Object o) {
//
//    }
//}