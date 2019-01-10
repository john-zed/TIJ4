package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 16:45
 * Brief    : 匿名内部类可以继承自一个普通类，并调用其带参构造器
 */
public class Wrapping {

    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value(){
        return i;
    }
}