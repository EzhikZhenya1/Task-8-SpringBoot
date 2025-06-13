package churakov.springboot.dao;

import churakov.springboot.model.User;

import java.util.List;

public interface UserDAOInterface {
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User findUserById(int id);
    List<User> findAllUsers();
}