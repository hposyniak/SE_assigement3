package designpat.bakery;

public class Sprinkles extends BaseDecorator{

    private Cake cake;

    public Sprinkles(Cake cake){
        this.cake = cake;
    }
    @Override
    public int getCost() {
        return cake.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
    
}
