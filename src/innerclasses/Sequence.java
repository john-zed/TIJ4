package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 14:26
 * Brief    : 内部类对象可以直接访问外部类的所有成员
 */

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        public Sequence outer() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public boolean check(){
        return this == ((SequenceSelector)selector()).outer();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
