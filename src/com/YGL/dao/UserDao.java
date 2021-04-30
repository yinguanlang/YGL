package com.YGL.dao;

import com.YGL.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的Dao
 */
public interface UserDao {
    public List<User> findAll();

    public User findUserByUsernamePassword(String username, String password);


    void add(User user);


    void delete(int parseInt);



    //void update(User user);

}
