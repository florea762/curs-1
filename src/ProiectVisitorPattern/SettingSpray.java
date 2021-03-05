package ProiectVisitorPattern;

public class SettingSpray implements ItemElement{
    private int price;
    private int milliliters;
    private String name;
    private String state;

    public SettingSpray(int cost, int ml, String style, String status) {
        this.price = cost;
        this.milliliters = ml;
        this.name = style;
        this.state= status;
    }

    public int getPrice() {
        return price;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {return state; }

 public int accept(ShoppingCart visitor) {
        return visitor.visit(this);
 }
}
