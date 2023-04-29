package designpat.telephone;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements Notifier{
    private final PhoneModel model;
    private List<Observer> observers = new ArrayList<Observer>();

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 10;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            model.addDigit(newDigit);
        }


    }


    @Override
    public void notifyObservers(ObserverType type) {

        for(Observer observer: observers){
            observer.update(type);
        }

    }

    @Override
    public void add(Observer observer) {

        observers.add(observer);
    }
}
