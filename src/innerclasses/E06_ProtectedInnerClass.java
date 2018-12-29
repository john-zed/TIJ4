package innerclasses;

import innerclasses.exercise6.SimpleInterface;
import innerclasses.exercise6b.SimpleClass;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 15:35
 * Brief    : 内部类的构造器的访问权限同定义内部类的访问权限一样
 */
public class E06_ProtectedInnerClass extends SimpleClass {

    public SimpleInterface get() {
        return new Inner();
    }

    public static void main(String[] args) {
        new E06_ProtectedInnerClass().get().f();
    }

    /**
     * You cannot access the synthesized(合成的) default constructor from
     E06 ProtectedInnerClass because it has the same protected access as the
     defining class.
     */
}
