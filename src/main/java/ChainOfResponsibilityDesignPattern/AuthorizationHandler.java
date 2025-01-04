package ChainOfResponsibilityDesignPattern;

// Concrete Handler 2: AuthorizationHandler
public class AuthorizationHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("AUTHORIZE")) {
            System.out.println("AuthorizationHandler: Handling authorization request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
