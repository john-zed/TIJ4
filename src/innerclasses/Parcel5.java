package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/8 16:26
 * Brief    : 方法内部嵌套一个类 （局部内部类）
 */
public class Parcel5 {
    public Destination destination(String s){
        //该类在destination方法之外无法访问
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
