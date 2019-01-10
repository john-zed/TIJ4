package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 16:26
 * Brief    : 返回一个匿名内部类的实例
 */
public class Parcel7 {

    public Contents contents() {
        return new Contents() { //在此插入一个类定义
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };  //这里需要分号，代表的其实是表达式的结束
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}