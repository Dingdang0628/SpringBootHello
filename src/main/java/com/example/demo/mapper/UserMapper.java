package com.example.demo.mapper;

import com.example.demo.entity.IdNameEntity;
import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserEntity selectUserById(Integer id);

    List<UserEntity> selectAllUsers();

    void addUser(UserEntity userEntity);

    void updateName(IdNameEntity idNameEntity);
}
