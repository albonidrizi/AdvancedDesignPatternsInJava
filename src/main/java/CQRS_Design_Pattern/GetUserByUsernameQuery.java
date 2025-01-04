package CQRS_Design_Pattern;

// Concrete Query: Get User by Username
public class GetUserByUsernameQuery implements Query<User> {
    private UserRepository userRepository;
    private String username;

    public GetUserByUsernameQuery(UserRepository userRepository, String username) {
        this.userRepository = userRepository;
        this.username = username;
    }

    @Override
    public User execute() {
        return userRepository.getUserByUsername(username);
    }
}


