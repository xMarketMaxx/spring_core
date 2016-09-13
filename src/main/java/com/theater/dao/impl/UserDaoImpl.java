package com.theater.dao.impl;

import com.theater.dao.UserDao;
import com.theater.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class UserDaoImpl implements UserDao {

    private static List<User> users;

    static {
        users = new ArrayList<User>();
    }

    public User getUser(int id) {
        for (User u : users) {
            if (u.getId() == id)
                return u;
        }
        return null;
    }

    public boolean saveUser(User user) {
        return users.add(user);
    }

    public boolean removeUser(User user) {
        return users.remove(user);
    }

    public User getUserByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equals(email))
                return u;
        }
        return null;
    }

    public List<User> getAll() {
        return Collections.unmodifiableList(users);
    }
}
