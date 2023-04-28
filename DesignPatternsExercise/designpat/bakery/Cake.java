package designpat.bakery;

/**
 * Cake bake class.
 */
public abstract class Cake {
    protected int CAKE_COST = 10;

    public abstract int getCost();

    public abstract String getDescription();
}
