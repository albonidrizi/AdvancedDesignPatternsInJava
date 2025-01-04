package ChainOfResponsibilityDesignPattern;

/**
 * @author Albon Idrizi https://www.linkedin.com/in/albonidrizi

 * @Chain of Responsibility Design Pattern is a behavioral design pattern that allows you to pass a request through a chain of handlers until it is handled.
 * @Benefits:
 * @1. Flexibility: The Chain of Responsibility pattern allows you to add or remove handlers dynamically, which can make your application more flexible and easier to maintain.
 * @2. Reusability: The Chain of Responsibility pattern can be reused in different parts of your application, which can help you avoid duplicating code and improve code reusability.
 * @3. Separation of Concerns: The Chain of Responsibility pattern can help you separate different types of requests into different handlers, which can improve code readability and maintainability.
 * @4. Decoupling: The Chain of Responsibility pattern can help you decouple different parts of your application, which can improve code readability and maintainability.
 */
// Client Class
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler loggingHandler = new LoggingHandler();

        // Set the chain of responsibility
        authenticationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(loggingHandler);

        // Sending different requests to the chain
        System.out.println("Client: Sending AUTHENTICATE request.");
        authenticationHandler.handleRequest("AUTHENTICATE");

        System.out.println("\nClient: Sending AUTHORIZE request.");
        authenticationHandler.handleRequest("AUTHORIZE");

        System.out.println("\nClient: Sending LOG request.");
        authenticationHandler.handleRequest("LOG");

        System.out.println("\nClient: Sending UNHANDLED request.");
        authenticationHandler.handleRequest("UNHANDLED");
    }
}
