package RepositoryDesignPattern;

import java.util.List;

// Repository Interface
public interface UserRepository {
    void save(User user);
    User findById(int id);
    List<User> findAll();
    void delete(int id);
}

