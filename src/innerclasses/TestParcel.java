package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 16:45
 * Brief    :
 */

class Parcel4 {
    //private内部类，因此只有Parcel4能访问
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    //protected内部类，只有Parcel4及子类和同一包下类能访问
    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        //非法的 -- 无法访问私有类
        //Parcel4.PContents pc = p.new PContents();
    }
}
