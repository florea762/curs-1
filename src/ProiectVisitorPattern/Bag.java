package ProiectVisitorPattern;

public class Bag implements ItemElement {
    private int price;
    private String model;
    private String state;

    public Bag(int cost, String color, String status) {
        this.price = cost;
        this.model = color;
        this.state= status;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getState() {return state; }

    @Override
    public int accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }
}
