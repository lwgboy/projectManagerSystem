package com.ectrip.service;

import com.ectrip.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 查询验证用户
     * @param userName
     * @param pwd
     * @return
     */
    boolean valUser(String userName,String pwd);

    /**
     * 分页查询用户
     * @param pageNo
     * @param pageSize
     * @param userName
     * @return list
     */
    List<User> queryUserByPageList(Integer pageNo,Integer pageSize,String userName,String userType);
}