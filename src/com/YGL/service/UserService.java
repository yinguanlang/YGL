package com.YGL.service;


import com.YGL.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
    public User login(User user);

    /**
     * 保存User
     * @param user
     */
    void addUser(User user);


    /**
     * 根据id删除
     * @param id
     */
    void deleteUser(String id);






}
