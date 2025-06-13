package churakov.springboot.service;

import churakov.springboot.dao.UserDAO;
import churakov.springboot.dao.UserDAOInterface;
import churakov.springboot.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService implements UserDAOInterface {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public User findUserById(int id) {
        return userDAO.findUserById(id);
    }

    @Override
    @Transactional
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }
}
