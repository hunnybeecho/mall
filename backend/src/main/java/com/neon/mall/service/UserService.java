package com.neon.mall.service;

import com.neon.mall.exception.MallException;
import com.neon.mall.model.pojo.User;

public interface UserService {
    User getUser();

    void register(String userName, String password, String emailAddress) throws MallException;

    User login(String userName, String password) throws MallException;

    void updateInformation(User user) throws MallException;

    boolean checkAdminRole(User user);

    boolean checkEmailRegistered(String emailAddress);
}
