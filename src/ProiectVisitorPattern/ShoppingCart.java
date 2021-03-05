package ProiectVisitorPattern;

public interface ShoppingCart {
    int visit (Bag bag);
    int visit (SettingSpray spray);
    int visit (Shoes shoes);
}
