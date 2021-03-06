package com.nari.demo.service.impl;

import com.nari.demo.dao.IUserDao;
import com.nari.demo.service.IUserService;
import com.nari.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyuwang
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getUsers () {
        List<User> users = userDao.getUsers();
        if (users != null) {
            return users;
        }
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        if (id != null && id > 0) return userDao.getUserById(id);
        return null;
    }

    @Override
    public Integer insert(User user) {
        if (user != null
                && user.getName() != null
                && !"".equals(user.getName())
                && user.getAge() != null
                && user.getAge() > 0) {
            return userDao.insert(user);
        }
        return -1;
    }

    @Override
    public Integer update(User user) {
        if (user != null
                && user.getId() != null
                && user.getId() > 0) {
            return userDao.update(user);
        }
        return -1;
    }

    @Override
    public Integer delete(Integer id) {
        if (id != null && id > 0) {
            return userDao.delete(id);
        }
        return -1;
    }


}
