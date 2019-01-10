package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 17:25
 * Brief    : 匿名内部类执行初始化，是Parcel5的简化版
 */
public class Parcel9 {

    //在匿名内部类中使用的参数必须是final常量
    public Destination destination(final String dest) {
        return new Destination() {
            //这里匿名内部类使用了一个来自外部的对象，必须是final的
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}