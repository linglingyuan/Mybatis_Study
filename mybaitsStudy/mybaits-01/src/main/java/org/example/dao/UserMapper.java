package org.example.dao;

import java.util.*;
import org.example.pojo.User;

import java.util.List;

//UserMapper.xml文件中的id为该接口中的函数名
public interface UserMapper {
    //获取全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //添加一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);
    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
}
