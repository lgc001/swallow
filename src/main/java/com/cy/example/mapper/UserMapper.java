package com.cy.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.cy.example.Vo.PageVo;
import com.cy.example.entity.UserEntity;

@Mapper
public interface UserMapper {

    int add(UserEntity user);
 
    int update(UserEntity user);
 
    int delete(Long id);
    
    UserEntity validate(UserEntity user);
 
    UserEntity findOneById(Long id);
 
    List<UserEntity> findAll(@Param("page")PageVo page);
    
    int findAllCount(@Param("page")PageVo page);
    
    int searchAllCount(@Param("user")UserEntity user,@Param("page")PageVo page);
    
    List<UserEntity> searchAll(@Param("user")UserEntity user,@Param("page")PageVo page);
}