package innerclasses;

import innerclasses.exercise6.SimpleInterface;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 15:38
 * Brief    : 隐藏的内部类无法被向上转型
 */

class Outer {
    private class Inner implements SimpleInterface {

        @Override
        public void f() {
            System.out.println("Outer.Inner.f");
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }

    public Inner get2() {
        //这里返回的是Inner类型，然而在Out类外部调用时，无法使用返回的Inner类型，因为Inner是私有的而且仅在Outer内可见。
        //因此只有Outer的方法可以使用Inner类型，而其他类的方法只能使用向上转型后的接口类型。
        return new Inner();
    }
}

public class E11_HiddenInnerClass {

    public static void main(String[] args) {
        Outer o = new Outer();
        SimpleInterface si = o.get();
        si = o.get2();
        //无法通过编译 Inner 不可见
        //Inner i1 = o.get2();
        //Inner i2 = (Inner)si;
    }
}