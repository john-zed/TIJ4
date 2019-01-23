package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 14:40
 * Brief    :
 */
public class E19_NestedClass {

    private static class NestedClass1{
        private static class NestedClass2{
            static void f(){}
        }
    }

    public static void main(String[] args) {
        NestedClass1.NestedClass2.f();
    }
}