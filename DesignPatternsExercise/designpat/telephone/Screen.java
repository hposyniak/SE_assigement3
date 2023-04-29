package designpat.telephone;

import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen implements Observer {
    private final PhoneModel model;

    public Screen(PhoneModel model) {

        this.model = model;

    }

    @Override
    public void update(ObserverType type) {

        if(type == ObserverType.DIGIT){

            System.out.println("Pressing: " + model.getCurrDigit());
            System.out.println(model.getCurrDigit());

        } else if(type == ObserverType.DIAL){

            System.out.print("Now dialing ");

            for(int digit:model.getDigits()){
                System.out.print(digit);
            }

            System.out.print("...");

        }

    }

}
