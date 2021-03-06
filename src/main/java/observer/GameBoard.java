package observer;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Subject<String>{
    List<Observer<String>> observers = new ArrayList<>();

    public void makeMove(int x, int y) {
        //logika gry
        notifyAllObserver("x: " + x + ", y: " + y);
    }

    @Override
    public void addObserver(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObserver(String message) {
        observers.stream().forEach(o -> o.update(message));

    }
}
