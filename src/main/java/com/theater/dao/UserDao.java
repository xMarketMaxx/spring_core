package com.theater.dao;

import com.theater.domain.User;

import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface UserDao {
    User getUser(int id);

    boolean saveUser(User user);

    boolean removeUser(User user);

    User getUserByEmail(String email);

    List<User> getAll();
}
