package designpat.telephone;

import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen implements Observer {
    private final PhoneModel model;
    private final ObserverType type;
    public String phoneNum = "";

    public Screen(PhoneModel model, ObserverType type) {

        this.model = model;
        this.type = type;
        this.model.addObserver(this);
    }

    @Override
    public void update(PhoneModel model) {

        List<Integer> digits = model.getDigits();

        if(type == ObserverType.DIGIT){

            System.out.println(digits.get(digits.size()-1));
        } else if(type == ObserverType.DIAL){


        }






    }
}
