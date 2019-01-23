package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 16:39
 * Brief    : 创建一个包含嵌套类的接口，该嵌套类中有一个static方法，它调用接口中的方法并显示结果。实现这个接口，并将这个实现的一个实例传递给你这个方法。
 */
interface I {

    void f();

    void g();

    class Nested {

        //静态方法要能接收一个参数
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }


}

public class E21_InterfaceWithNested2 {

    public static void main(String[] args) {
        //使用匿名内部类创建接口的实例
        I impl = new I() {
            @Override
            public void f() {

            }

            @Override
            public void g() {

            }
        };

        I.Nested.call(impl);
    }

}