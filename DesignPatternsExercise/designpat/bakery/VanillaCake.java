package designpat.bakery;

public class VanillaCake extends Cake {
    @Override
    public String getDescription() {
        return "Vanilla cake";
    }

    @Override
    public int getCost() {
        return super.CAKE_COST;
    }
}
