package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 17:43
 * Brief    : 为匿名内部类创造构造器效果
 */

abstract class Base{
    public Base(int i){
        System.out.println("Base constructor " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {

    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializing");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}