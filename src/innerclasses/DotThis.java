package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 15:14
 * Brief    : 在内部类中获取对外部类对象的引用
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            //只写一个this则会是Inner的this
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        dt.f();
        Inner dti = dt.inner();
        dti.outer().f();
    }

}
