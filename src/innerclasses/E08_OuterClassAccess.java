package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 15:47
 * Brief    :
 */
public class E08_OuterClassAccess {

    class Inner{
        private int i = 10;
        private void f(){
            System.out.println("Inner.f i = " + i);
        }
    }

    public void testInnerClass(){
        Inner inner = new Inner();
        inner.i = 11;
        inner.f();
    }

    public static void main(String[] args) {
        E08_OuterClassAccess oca = new E08_OuterClassAccess();
        oca.testInnerClass();
    }

}
