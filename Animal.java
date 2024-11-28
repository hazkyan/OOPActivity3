public class Animal {
    private String name;
    private String characteristic;

    // Constructor
    public Animal(String name, String characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for characteristic
    public String getCharacteristic() {
        return characteristic;
    }

    // Method to be overridden by child classes
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    // Method to display basic information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Characteristic: " + characteristic);
    }
}
