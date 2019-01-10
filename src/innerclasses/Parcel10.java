package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 17:57
 * Brief    : 匿名内部类实例的初始化使用外部参数
 */
public class Parcel10 {

    public Destination destination(final String dest, final float price) {
        return new Destination() {

            private int cost;

            //每个对象实例在初始化时都会执行
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}