package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 15:42
 * Brief    : 使用.new 创建内部类的实例
 */
public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String toWhere) {
            label = toWhere;
        }

        public String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
