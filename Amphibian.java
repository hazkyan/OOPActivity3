public class Amphibian extends Animal {

    public Amphibian(String name) {
        super(name, "Lives both in water and on land.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Croak!");
    }
}
