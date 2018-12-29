package interfaces;

import java.util.Random;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/5 15:18
 * Brief    : 该类不实现Readable接口，如何让Scanner作用于它？
 */
public class RandomDoubles {
    private static Random rand = new Random(47);

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
