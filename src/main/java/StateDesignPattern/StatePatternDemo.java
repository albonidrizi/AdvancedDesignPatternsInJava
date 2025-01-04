package StateDesignPattern;

/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  @TheStatePattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. It does this by encapsulating the state-specific behavior in separate objects called states, and delegating the behavior to the current state object.
 *
 * @Benefits:
 * @1. Code Reusability: The State pattern allows you to reuse existing state objects, which can reduce the amount of code you need to write and maintain.
 * @2. Flexibility: The State pattern allows you to change the behavior of an object at runtime, which can make your application more flexible and easier to maintain.
 * @3. Separation of Concerns: The State pattern separates the state-specific behavior from the object's core functionality, which can improve code readability and maintainability.
 * @4. Testability: The State pattern makes it easier to test the behavior of an object in different states, which can help you ensure that your application is working as expected.
 * @WhentoUse:
 * @1. When you need to change the behavior of an object based on its internal state.
 * @2. When you want to encapsulate the state-specific behavior in separate objects.
 * @3. When you want to make your code more flexible and easier to maintain.
 */
// Client Class
public class StatePatternDemo {
    public static void main(String[] args) {
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        Context context = new Context(stateA);

        // Handling request in State A
        context.request();

        // Changing state to B
        context.setState(stateB);
        context.request();

        // Changing state back to A
        context.setState(stateA);
        context.request();
    }
}
