package StateDesignPattern;

// Concrete State 2: ConcreteStateB
public class ConcreteStateB implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request in State B");
    }
}
