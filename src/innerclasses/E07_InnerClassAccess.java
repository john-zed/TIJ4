package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 15:39
 * Brief    : 内部类可以直接访问外部类私有的元素和方法
 */
public class E07_InnerClassAccess {
    private int i = 10;
    private void f(){
        System.out.println("E07_InnerClassAccess.f");
    }

    class Inner{
        void g(){
            i++;
            f();
        }
    }

    public void h(){
        Inner inner = new Inner();
        inner.g();
        System.out.println("i = " + i);
    }



    public static void main(String[] args) {
        E07_InnerClassAccess ica = new E07_InnerClassAccess();
        ica.h();
    }
}

/**
 * This exercise shows that inner classes have transparent access to their outer-
 class objects, even private fields and methods.
 */
