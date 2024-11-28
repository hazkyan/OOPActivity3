public class Mammal extends Animal {

    public Mammal(String name) {
        super(name, "Warm-blooded and has fur or hair.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Roar, Growl, or Whistle!");
    }
}
