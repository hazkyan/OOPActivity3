public class Reptile extends Animal {

    public Reptile(String name) {
        super(name, "Cold-blooded and has scales.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hiss!");
    }
}
