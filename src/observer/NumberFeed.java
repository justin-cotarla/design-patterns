package observer;

import java.util.ArrayList;

public class NumberFeed implements Subject {
    private ArrayList<Observer> observers = new ArrayList();
    private int currentNumber = 0;

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observers) {
            obs.update();
        }
    }

    public void setState(int number) {
        currentNumber = number;
        notifyObservers();
    }

    public int getState() {
        return currentNumber;
    }
}
