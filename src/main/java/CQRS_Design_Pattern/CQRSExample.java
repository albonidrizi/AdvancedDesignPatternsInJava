package CQRS_Design_Pattern;

/**
 * @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 * CQRS (Command Query Responsibility Segregation) Pattern in Java
 * The CQRS (Command Query Responsibility Segregation) pattern is a design pattern that separates read and write operations to optimize performance and scalability in applications, especially for systems with large-scale data or distributed architectures.

 @Benefits:
 * @1. Performance: CQRS allows you to optimize read and write operations independently, which can improve the performance of your application.
 * @2. Scalability: By separating read and write operations, you can scale each part of your application independently, which can help you handle large-scale data or distributed architectures.
 * @3. Flexibility: CQRS allows you to use different models for read and write operations, which can give you more flexibility in designing your application.
 * @4. Security: CQRS can help you improve security by separating read and write operations, which can help you control access to sensitive data.
 */

public class CQRSExample {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        CommandDispatcher commandDispatcher = new CommandDispatcher();
        QueryDispatcher queryDispatcher = new QueryDispatcher();

        // Add a user using Command
        Command addUserCommand = new AddUserCommand(userRepository, "albon_idrizi", "albonidrizi@gmail.com");
        commandDispatcher.dispatch(addUserCommand);

        // Retrieve the user using Query
        Query<User> getUserQuery = new GetUserByUsernameQuery(userRepository, "albon_idrizi");
        User user = queryDispatcher.dispatch(getUserQuery);

        System.out.println("User retrieved: " + user.getUsername() + ", " + user.getEmail());
    }
}

