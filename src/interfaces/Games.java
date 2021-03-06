package interfaces;

/**
 * Author   : Victor Chong
 * Date     : 2018/11/7 10:52
 * Brief    : 工厂方法表现了额外的间接性，这样做的一个常见原因就是想要创建框架。比如在相同的棋盘上下国际象棋和西洋跳棋。
 */
interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {
    public static void playGame(GameFactory factory){
        //这个方法即在相同的棋盘上下不同的游戏，只要接口类型即可，不需要具体类型
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }

}
