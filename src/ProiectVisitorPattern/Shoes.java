package ProiectVisitorPattern;

public class Shoes implements ItemElement{
    private int price;
    private int heel;
    private String type;

    public Shoes(int cost, int cm, String shoe) {
        this.price = cost;
        this.heel = cm;
        this.type = shoe;
    }

    public int getPrice() {
        return price;
    }

    public int getHeel() { return heel; }

    public String getModel() {
        return type;
    }

    @Override
    public int accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }
}

