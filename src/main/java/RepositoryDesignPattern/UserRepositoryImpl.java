package RepositoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Repository Implementation (using a simple in-memory store)
public class UserRepositoryImpl implements UserRepository {
    private List<User> database = new ArrayList<>();

    @Override
    public void save(User user) {
        database.add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : database) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return database;
    }

    @Override
    public void delete(int id) {
        User userToDelete = findById(id);
        if (userToDelete != null) {
            database.remove(userToDelete);
        }
    }
}
