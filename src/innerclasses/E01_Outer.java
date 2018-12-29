package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 13:47
 * Brief    :
 */
public class E01_Outer {
    class Inner {
        String name() {
            return getClass().getSimpleName();
        }
    }

    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        E01_Outer outer = new E01_Outer();
        Inner inner = outer.getInner();
        System.out.println(inner.name());
    }

}
