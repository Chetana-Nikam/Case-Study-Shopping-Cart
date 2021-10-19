package com.chetana.authenticationservice.service;

import java.security.NoSuchAlgorithmException;

import com.chetana.authenticationservice.entity.UserInfo;

public interface AuthDataService {

    UserInfo findByUsername(String username);

    UserInfo findByEmail(String email);

    void deleteByUsernamePassword(String username, String password) throws NoSuchAlgorithmException;

    void createUserProfile(UserInfo userInfo) throws NoSuchAlgorithmException;
}
