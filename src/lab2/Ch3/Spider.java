package lab2.Ch3;

public class Spider extends Animal{
    public Spider() {
        super(8);
    }
    public void eat() {
        super.eat();
        System.out.println(" like a spider. ");
    }
}
