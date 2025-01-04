package RepositoryDesignPattern;

/**
 * @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  The Repository design pattern is a software design pattern for encapsulating the logic to retrieve and store data.
 *  It is intended to increase the separation of concerns between the domain and data mapping layers,
 *  by moving the storage-related operations out of the domain layer.
 *
 * Key Concepts:
 * @Abstraction of Data Access: The Repository pattern hides the details of data access logic (e.g., SQL queries, database connections) from the rest of the application.
 * @Centralized Data Access: It provides a central point of access for data from different sources (e.g., databases, external APIs) in a unified way.
 * @Decoupling: The business logic doesn't need to know whether data is coming from a relational database, NoSQL store, or external service.
 *
 *  The Repository pattern is a structural pattern that provides a layer of abstraction between the domain model and data mapping layers.*/

// Main
public class RepositoryPatternDemo {
    public static void main(String[] args) {
        // Creating a repository instance
        UserRepository userRepository = new UserRepositoryImpl();

        // Creating some users
        User user1 = new User(1, "Anila");
        User user2 = new User(2, "Nita");

        // Saving users to the repository
        userRepository.save(user1);
        userRepository.save(user2);

        // Retrieving and displaying users
        System.out.println("User with ID 1: " + userRepository.findById(1).getName());
        System.out.println("All users: ");
        for (User user : userRepository.findAll()) {
            System.out.println(user.getName());
        }

        // Deleting a user
        userRepository.delete(1);
        System.out.println("After deletion, all users: ");
        for (User user : userRepository.findAll()) {
            System.out.println(user.getName());
        }
    }
}
