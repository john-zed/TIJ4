package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/21 9:41
 * Brief    : 使用匿名内部类重写第9章的练习19
 */

interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossGame();
}

class CoinTossing implements Tossing {

    private CoinTossing(){}

    private int events;
    private static final int EVENTS = 2;

    @Override
    public boolean event() {
        System.out.println("Coin Tossing event " + events);
        return ++events != EVENTS;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossGame() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Tossing {

    private DiceTossing(){}

    private int events;
    private static final int EVENTS = 6;

    @Override
    public boolean event() {
        System.out.println("Dice Tossing event " + events);
        return ++events != EVENTS;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossGame() {
            return new DiceTossing();
        }
    };
}

public class E17_TossingFramework {

    private static void simulate(TossingFactory factory) {
        Tossing tossing = factory.getTossGame();
        while (tossing.event())
            ;
    }

    public static void main(String[] args) {
        simulate(CoinTossing.factory);
        simulate(DiceTossing.factory);
    }
}
