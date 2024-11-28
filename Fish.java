public class Fish extends Animal {

    public Fish(String name) {
        super(name, "Lives in water and breathes through gills.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Blub blub!");
    }
}
