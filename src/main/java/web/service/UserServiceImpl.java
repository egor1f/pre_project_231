package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.entity.User;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {}

    @Autowired
    UserDao userDao = new UserDaoImp();
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void removeUserById(Integer userId) {
        userDao.removeUserById(userId);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
