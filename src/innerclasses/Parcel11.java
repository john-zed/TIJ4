package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 14:15
 * Brief    : 嵌套类（静态内部类）
 */
public class Parcel11 {

    private static class ParcelContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {

        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        //嵌套类可以包含其他的静态元素
        public static void f() {
        }  //静态方法

        static int x = 10;   //静态属性

        static class AnotherLevel {   //嵌套类中的嵌套类
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}