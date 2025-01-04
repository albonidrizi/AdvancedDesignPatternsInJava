package ChainOfResponsibilityDesignPattern;

// Concrete Handler 1: AuthenticationHandler
public class AuthenticationHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("AUTHENTICATE")) {
            System.out.println("AuthenticationHandler: Handling authentication request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
