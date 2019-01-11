package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/11 17:13
 * Brief    : 使用匿名内部类方式改为练习7
 */
public class E12_AnonymousInnerClassAccess {

    private int i = 11;

    private void f(){
        System.out.println("E12_AnonymousInnerClassAccess.f");
    }

    public void h(){
        //由于未说明匿名内部类要继承接口，因此返回类型用根类型Object
        new Object(){
            void g(){
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        new E12_AnonymousInnerClassAccess().h();
    }
}