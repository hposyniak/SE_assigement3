package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {

        digits.add(newDigit);
        notifyObservers();
    }

    public List<Integer> getDigits() {

        return digits;
    }

    public void addObserver(Observer observer){

        observers.add(observer);

    }

    public void removeObserver(Observer observer){

        observers.remove(observer);

    }

    public void notifyObservers(){

        for(Observer observer : observers){

            observer.update(this);

        }

    }


}
