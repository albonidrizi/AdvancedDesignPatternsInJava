package CQRS_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

// Write Model: UserRepository
public class UserRepository {
    private Map<String, User> userStore = new HashMap<>();

    public void addUser(User user) {
        userStore.put(user.getUsername(), user);
    }

    public User getUserByUsername(String username) {
        return userStore.get(username);
    }
}

