package com.theater.service;

import com.theater.domain.User;

import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface UserService {
    void save(User user);

    void remove(User user);

    User getById(int id);

    User getUserByEmail(String email);

    List<User> getAll();
}
