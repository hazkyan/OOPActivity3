public class Invertebrate extends Animal {

    public Invertebrate(String name) {
        super(name, "Does not have a backbone.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a subtle or no sound.");
    }
}
