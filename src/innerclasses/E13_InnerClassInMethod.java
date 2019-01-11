package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/11 17:23
 * Brief    : 用匿名内部类方式重写练习9
 */
public class E13_InnerClassInMethod {

    public Contents contents(){
        return new Contents(){

            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        E13_InnerClassInMethod ic = new E13_InnerClassInMethod();
        System.out.println(ic.contents().value());
    }
}