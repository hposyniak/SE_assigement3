package designpat.bakery;

public class ChocolateCake extends Cake {
    @Override
    public String getDescription() {
        return "Chocolate cake";
    }

    @Override
    public int getCost() {
        return super.CAKE_COST;
    }
}
