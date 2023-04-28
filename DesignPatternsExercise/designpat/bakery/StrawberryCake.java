package designpat.bakery;

public class StrawberryCake extends Cake{

    @Override
    public int getCost() {
        return super.CAKE_COST*2;
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
    
}
