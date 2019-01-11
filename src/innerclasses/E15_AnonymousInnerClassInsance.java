package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/11 17:49
 * Brief    : 匿名内部类实例化时传递参数
 */

class SimpleClass {
    private int i = 10;

    SimpleClass(int x) {
        i = x;
    }

    void value(){
        System.out.println(i);
    }
}

public class E15_AnonymousInnerClassConstructor {

    public SimpleClass getSimpleClassInstance(final int i){
        return new SimpleClass(i){
        };
    }

    public static void main(String[] args) {
        E15_AnonymousInnerClassConstructor aic = new E15_AnonymousInnerClassConstructor();
        aic.getSimpleClassInstance(15).value();
    }

}