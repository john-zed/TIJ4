package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/16 16:33
 * Brief    : 使用匿名内部类重写Games
 */

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {

    private Checkers(){}

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };

}

class Chess implements Game {

    private Chess(){}

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    public static void playGame(GameFactory factory){
        //这个方法即在相同的棋盘上下不同的游戏，只要接口类型即可，不需要具体类型
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }

}
