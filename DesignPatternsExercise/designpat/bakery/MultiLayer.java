package designpat.bakery;

public class MultiLayer extends BaseDecorator{
    private Cake cake;

    public MultiLayer(Cake cake){
        this.cake = cake;
    }
    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }
}