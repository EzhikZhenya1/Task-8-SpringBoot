package churakov.springboot.service;

import churakov.springboot.model.User;

import java.util.List;

public interface UserServiceInterface {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User findUserById(int id);
    List<User> findAllUsers();
}