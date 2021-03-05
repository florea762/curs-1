package ProiectVisitorPattern;

public class Implementation implements ShoppingCart {
    @Override
    public int visit(Bag bag) {
        int cost;
        if(bag.getState().equals("sales")) {
            cost = bag.getPrice() - (20 * bag.getPrice())/100;
        } else cost = bag.getPrice();
        System.out.println("Bag " + bag.getModel() + " -> " + cost + " dollars");
        return cost;
    }

    @Override
    public int visit(SettingSpray spray) {
        int cost;
        if(spray.getState().equals("sales")) {
            cost = spray.getPrice() - (15 * spray.getMilliliters())/100;
        } else cost = spray.getPrice();
        System.out.println(("Spray " + spray.getName()) + " -> " + cost + " dollars");
        return cost;
    }

    @Override
    public int visit(Shoes shoes) {
        int cost;
        cost = shoes.getPrice();
        System.out.println((shoes.getModel()) + " " + shoes.getHeel() + " cm" + " -> " + cost + " dollars");
        return cost;
    }
}
