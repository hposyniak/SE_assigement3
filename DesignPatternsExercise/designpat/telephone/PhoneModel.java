package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private int currDigit;

    private final Screen screen;

    private final KeyPad keyPad;

    public PhoneModel(){

        screen = new Screen(this);
        keyPad = new KeyPad(this);
        keyPad.add(screen);

    }


    public void addDigit(int newDigit) {

        digits.add(newDigit);

        currDigit = newDigit;

        keyPad.notifyObservers(ObserverType.DIGIT);

        if(digits.size()==10){
            keyPad.notifyObservers(ObserverType.DIAL);
        }


    }

    public KeyPad getKeyPad(){

        return keyPad;
    }

    public List<Integer> getDigits() {

        return digits;
    }

    public int getCurrDigit(){

        return currDigit;

    }



}
