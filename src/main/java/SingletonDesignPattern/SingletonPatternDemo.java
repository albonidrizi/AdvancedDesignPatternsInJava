package SingletonDesignPattern;


/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  The Singleton design pattern is a software design pattern that restricts the instantiation of a class to a single instance.
 *  This is useful when exactly one object is needed to coordinate actions across the system.
 *  The Singleton pattern is a creational pattern that ensures that a class has only one instance and provides a global point of access to that instance.
 *  The Singleton pattern is a software design pattern that restricts the instantiation of a class to a single instance.
 *  This is useful when exactly one object is needed to coordinate actions across the system.
 *  *
 * @-HowtheExampleWorks:
 * @PrivateConstructor: The constructor of the Singleton class is private, so you cannot create an instance of the class directly using new.
 * @StaticInstance: A private static variable instance holds the single instance of the class.
 * @GlobalAccessMethod (getInstance()): This method ensures that only one instance of the class is created. If the instance is null, it initializes it. Otherwise, it returns the already created instance.
 * @Usage: In the SingletonPatternDemo, we use the getInstance() method to get the singleton instance. The two references singleton1 and singleton2 point to the same object, ensuring that only one instance exists.
 *  */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Step 5: Accessing Singleton instance using the getInstance() method
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Step 6: Both references point to the same instance
        singleton1.displayMessage();
        singleton2.displayMessage();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
