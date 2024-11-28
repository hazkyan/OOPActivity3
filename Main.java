public class Main {
    public static void main(String[] args) {
        // Create instances of different animal types
        Animal lion = new Mammal("Lion");
        Animal parrot = new Bird("Parrot");
        Animal snake = new Reptile("Snake");
        Animal frog = new Amphibian("Frog");
        Animal jellyfish = new Invertebrate("Jellyfish");
        Animal goldfish = new Fish("Goldfish");

        // Store all animals in an array to demonstrate polymorphism
        Animal[] animals = {lion, parrot, snake, frog, jellyfish, goldfish};

        // Loop through each animal and display their information
        for (Animal animal : animals) {
            animal.displayInfo();  // Display name and characteristics
            animal.makeSound();    // Call the overridden makeSound method
            System.out.println();
        }
    }
}
