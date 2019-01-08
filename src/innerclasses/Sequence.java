package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 14:26
 * Brief    : 内部类对象可以直接访问外围对象的所有成员；内部类可以访问外围类所有元素;也是迭代器设计模式的一个例子
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
            return i == items.length;   //内部类可访问外围类元素
        }

        @Override
        public Object current() {
            return items[i];    //内部类可访问外围类元素
        }

        @Override
        public void next() {
            if (i < items.length) i++;  //内部类可访问外围类元素
        }
    }

    public Selector selector() {
        return new SequenceSelector();
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
