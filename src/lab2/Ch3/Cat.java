package lab2.Ch3;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String name) {         //constructor
        super( 4);
        this.name = name;
    }
    public Cat() {
        super( 4);
    }
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
    public void play() {
        System.out.println("Play like a cat.");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Like a cat. ");
    }
}
