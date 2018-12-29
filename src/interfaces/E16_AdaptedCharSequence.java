package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/5 15:49
 * Brief    :
 */

class CharSequence {

    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private static Random random = new Random(47);

    char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[random.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[random.nextInt(vowels.length)];
            buffer[idx++] = lowers[random.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}

public class E16_AdaptedCharSequence extends CharSequence implements Readable {

    private int count;

    public E16_AdaptedCharSequence(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new E16_AdaptedCharSequence(10));
        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
