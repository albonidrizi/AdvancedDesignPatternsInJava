package CQRS_Design_Pattern;

// Concrete Command: Add User Command
public class AddUserCommand implements Command {
    private UserRepository userRepository;
    private String username;
    private String email;

    public AddUserCommand(UserRepository userRepository, String username, String email) {
        this.userRepository = userRepository;
        this.username = username;
        this.email = email;
    }

    @Override
    public void execute() {
        userRepository.addUser(new User(username, email));
    }
}
