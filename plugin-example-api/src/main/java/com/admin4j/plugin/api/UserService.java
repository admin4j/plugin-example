package com.admin4j.plugin.api;


import com.admin4j.plugin.anno.SPI;

/**
 * @author andanyang
 * @since 2023/4/20 14:19
 */
@SPI("def")
public interface UserService {

    String getUserName();
    String setUserName(String username);
}
