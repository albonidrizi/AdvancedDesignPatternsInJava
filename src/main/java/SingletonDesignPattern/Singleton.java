package SingletonDesignPattern;

public class Singleton {
    // Step 1: Private static instance variable
    private static Singleton instance;

    // Step 2: Private constructor to prevent external instantiation
    private Singleton() {
        // private constructor to prevent instantiation
    }

    // Step 3: Public static method to provide access to the instance
    public static Singleton getInstance() {
        // Step 4: Lazy initialization
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Some example method to show usage
    public void displayMessage() {
        System.out.println("Hello from the Singleton!");
    }
}

