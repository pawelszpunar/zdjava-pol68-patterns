package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        GameBoard game = new GameBoard();
        game.addObserver(m -> {
            System.out.println("Wykonano ruch + " + m);
        });

        game.makeMove(10, 11);
    }
}
