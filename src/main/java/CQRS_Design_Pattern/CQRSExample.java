package CQRS_Design_Pattern;


public class CQRSExample {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        CommandDispatcher commandDispatcher = new CommandDispatcher();
        QueryDispatcher queryDispatcher = new QueryDispatcher();

        // Add a user using Command
        Command addUserCommand = new AddUserCommand(userRepository, "john_doe", "john.doe@example.com");
        commandDispatcher.dispatch(addUserCommand);

        // Retrieve the user using Query
        Query<User> getUserQuery = new GetUserByUsernameQuery(userRepository, "john_doe");
        User user = queryDispatcher.dispatch(getUserQuery);

        System.out.println("User retrieved: " + user.getUsername() + ", " + user.getEmail());
    }
}

