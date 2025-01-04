package CQRS_Design_Pattern;

// Command Dispatcher
public class CommandDispatcher {
    public void dispatch(Command command) {
        command.execute();
    }
}

