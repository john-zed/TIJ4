package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 14:40
 * Brief    :
 */

public class E03_Outer {
    private String data;

    E03_Outer(String s) {
        data = s;
    }

    class Inner {
        public String toString() {
            return data;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        E03_Outer outer = new E03_Outer("hello");
        System.out.println(outer.getInner().toString());
    }
}
