package com.admin4j.plugin.example;

import com.admin4j.plugin.api.UserService;

/**
 * @author andanyang
 * @since 2023/4/20 14:29
 */
public class UserService10Impl implements UserService {

    private String username;
    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String setUserName(String username) {
          this.username = username;
          return  username + this.getClass().getName();
    }
}
