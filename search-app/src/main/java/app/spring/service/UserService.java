package app.spring.service;

import app.spring.dao.UserDao;
import app.spring.model.Login;
import app.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

    public void register(User user) {
        userDao.register(user);
    }

}
