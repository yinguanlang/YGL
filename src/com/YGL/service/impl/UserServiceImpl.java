package com.YGL.service.impl;

import com.YGL.dao.UserDao;
import com.YGL.dao.impl.UserDaoImpl;

import com.YGL.domain.User;
import com.YGL.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //1.调用Dao完成查询

        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernamePassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }






}
