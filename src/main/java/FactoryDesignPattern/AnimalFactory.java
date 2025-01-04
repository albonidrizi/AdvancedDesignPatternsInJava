package FactoryDesignPattern;

// Factory Class
public class AnimalFactory {
    // Factory method to create objects
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}

