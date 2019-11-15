package com.nari.demo.ssm.dao;

import com.nari.demo.ssm.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuyuwang
 */
@Mapper
public interface IUserDao {

    List<User> getUsers();

    User getUserById(@Param("id") Integer id);

    /*List<User> getUserByPage(Integer pageCurr, Integer pageSize);*/

    Integer insert (@Param("user") User user);

    Integer update (@Param("user") User user);

    Integer delete (@Param("id") Integer id);

}
