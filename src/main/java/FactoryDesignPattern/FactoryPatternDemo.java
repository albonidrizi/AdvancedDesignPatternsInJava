package FactoryDesignPattern;

/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  @TheFactoryPattern is a design pattern used to abstract the instantiation process of objects. Instead of directly instantiating an object using the new keyword, the factory pattern uses a method (often called a factory method) to create and return objects. The purpose is to decouple the object creation process from the class that uses it, making the code more flexible and easier to maintain.
 *
 * @Benefits:
 * @1. Code Decoupling: The client doesn't need to know about the specific class being instantiated.
 * @2. Flexibility: The factory can choose different subclasses or configurations at runtime, based on conditions or parameters.
 * @3. Extensibility: New classes can be added without changing the client code that uses the factory.
 * @WhentoUse:
 * @1. When the exact type of object to be created isn’t known until runtime.
 * @2. When the process of creating an object is complex, involving multiple steps.
 * @3. When you want to create different types of objects but abstract the logic of object creation.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Using the Factory to create objects
        Animal animal1 = AnimalFactory.getAnimal("dog");
        animal1.speak(); // Output: Woof!

        Animal animal2 = AnimalFactory.getAnimal("cat");
        animal2.speak(); // Output: Meow!
    }
}
