package com.admin4j.plugin.example;

import com.admin4j.plugin.ExtensionLoader;
import com.admin4j.plugin.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andanyang
 * @since 2023/4/20 15:26
 */
public class App {

   static Logger logger = LoggerFactory.getLogger(App.class);

   static int i = 0;
    public static void main(String[] args) {

        logger.debug("ClassLoader = {}" , Thread.currentThread().getContextClassLoader());

        //设置环境变量
        //System.setProperty("PLUGIN_PATH", "C:\\Users\\andanyang\\Desktop\\plugin-java\\plugin");


        UserService userService;

        userService = ExtensionLoader.getExtensionLoader(UserService.class).getExtension("def");
        testBean(userService);

        userService = ExtensionLoader.getExtensionLoader(UserService.class).getExtension("def2");
        testBean(userService);

        userService = ExtensionLoader.getExtensionLoader(UserService.class).getExtension("def3");
        testBean(userService);


        userService = ExtensionLoader.getExtensionLoader(UserService.class).getDefaultExtension();
        testBean(userService);
    }

    private static void testBean(UserService def) {

        i++;
        String s = def.setUserName("小米" + i);
        String userName = def.getUserName();

        System.out.println("setUserName = " + s);
        System.out.println("userName = " + userName);

    }
}
