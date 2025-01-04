package StateDesignPattern;

// Concrete State 1: ConcreteStateA
public class ConcreteStateA implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request in State A");
    }
}
