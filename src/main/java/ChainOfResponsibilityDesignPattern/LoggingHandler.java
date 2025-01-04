package ChainOfResponsibilityDesignPattern;

// Concrete Handler 3: LoggingHandler
public class LoggingHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("LOG")) {
            System.out.println("LoggingHandler: Handling logging request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
