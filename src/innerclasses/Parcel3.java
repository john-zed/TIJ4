package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 15:42
 * Brief    :
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
        Contents c = p.new Contents();
        Destination d = p.new Destination("Tasmania");
    }
}
