package designpat.bakery;

public class SayingX extends BaseDecorator{
    protected Cake cake;
    private String saying;

    public SayingX(Cake cake, String saying){
        this.cake = cake;
        this.saying = saying;
    }
    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + "\"" + saying + "\"";
    }
    
}
