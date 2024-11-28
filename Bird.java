public class Bird extends Animal {

    public Bird(String name) {
        super(name, "Has feathers and lays eggs.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp or Tweet!");
    }
}
