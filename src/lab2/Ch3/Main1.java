package lab2.Ch3;

public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        Animal animalCat = cat;
        ((Cat)animalCat).play();
        cat.play();
    }
}
