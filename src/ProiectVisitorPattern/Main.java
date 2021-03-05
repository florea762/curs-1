/* Scopul proiectului este de a realiza un cos de cumparaturi pentru un magazin virtual. In acest cos pot fi plasati diferiti
itemi (accesorii, machiaj, incaltaminte). In cazul accesorilor si machiajelor, se pot alege produse cu pret redus.
La final se calculeaza pretul total, iar sub o anumita suma se adauga si o taxa de livrare.
 */

package ProiectVisitorPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Items in your basket: ");
        System.out.println(" ");

        ItemElement item1 = new Bag(20, "red", "sales");

        ItemElement item2 = new Bag(58, "blue", "");

        ItemElement item3 = new SettingSpray(30, 10, "Nyx", "");

        ItemElement item4 = new SettingSpray(48, 30, "Melkior", "sales");

        ItemElement item5 = new Shoes(200, 6, "Boots");

        ItemElement[] items = new ItemElement[]{item1, item2, item3, item4, item5};

        int total = calculatePrice(items);
        int ShippingFee;
        if (total > 250) {
            System.out.println(" ");
            System.out.println("Total cost with free shipping = " + total + " dollars");
        } else {
            ShippingFee = 20;
            System.out.println(" ");
            System.out.println("Total cart cost = " + total + " dollars");
            System.out.println("ShippingFee = " + ShippingFee + " dollars");}
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCart visitor = new Implementation();
        int sum = 0;
        for(ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
