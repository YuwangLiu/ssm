package com.nari.demo.service;

import com.nari.demo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();

    User getUserById(Integer id);

    Integer insert (User user);

    Integer update (User user);

    Integer delete (Integer id);

}
