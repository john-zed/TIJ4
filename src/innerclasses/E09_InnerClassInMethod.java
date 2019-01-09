package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 16:37
 * Brief    : 方法中创建内部类
 */
public class E09_InnerClassInMethod {

    public Contents contents() {
        class PContents implements Contents {

            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        }
        return new PContents();
    }

    public static void main(String[] args) {
        E09_InnerClassInMethod sic = new E09_InnerClassInMethod();
        System.out.println(sic.contents().value());
    }
}
