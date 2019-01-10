package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/10 16:32
 * Brief    : 匿名内部类的展开
 */
public class Parcel7b {

    class MyContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}