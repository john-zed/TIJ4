package interfaces;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 11:33
 * Brief    :
 */

interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossGame();
}

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;

    @Override
    public boolean event() {
        System.out.println("Coin Tossing event " + events);
        return ++events != EVENTS;
    }
}

class CoinTossingFactory implements TossingFactory {

    @Override
    public Tossing getTossGame() {
        return new CoinTossing();
    }
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;

    @Override
    public boolean event() {
        System.out.println("Dice Tossing event " + events);
        return ++events != EVENTS;
    }
}

class DiceTossingFactory implements TossingFactory {

    @Override
    public Tossing getTossGame() {
        return new DiceTossing();
    }
}

public class E19_TossingFramework {

    private static void simulate(TossingFactory factory) {
        Tossing tossing = factory.getTossGame();
        while (tossing.event())
            ;
    }

    public static void main(String[] args) {
        simulate(new CoinTossingFactory());
        simulate(new DiceTossingFactory());
    }
}
