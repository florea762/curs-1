package lab2.Ch3;

public class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs=legs;
    }
    public void walk() {
        System.out.print("Walk");
    }
    public void eat() {
        System.out.println("Eat");
    }
}
