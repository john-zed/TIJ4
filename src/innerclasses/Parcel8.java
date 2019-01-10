package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 16:46
 * Brief    : 如何在创建匿名类对象时调用基类的带参构造器
 */
public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) { //传递构造器参数完成对基类构造器的调用
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(1);
    }
}