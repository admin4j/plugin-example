package com.admin4j.plugin.example;

import com.admin4j.plugin.ExtensionLoader;
import com.admin4j.plugin.example.api.DepartService;
import com.admin4j.plugin.example.api.UserService;
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

        logger.debug("ClassLoader = {}", Thread.currentThread().getContextClassLoader());

        //设置环境变量
        System.setProperty("PLUGIN_PATH", "C:\\Users\\andanyang\\Desktop\\plugin-java\\plugin");


        UserService userService;

        userService = ExtensionLoader.getExtensionLoader(UserService.class).getExtension("def");
        testBean(userService);

        ClassLoader classLoader = userService.getClass().getClassLoader();
        System.out.println("classLoader = " + classLoader);
        System.out.println("classLoader getParent = " + classLoader.getParent());

        userService = ExtensionLoader.getExtensionLoader(UserService.class).getExtension("app-01");
        testBean(userService);


        DepartService departService;
        departService = ExtensionLoader.getExtensionLoader(DepartService.class).getDefaultExtension();

        String test1 = departService.print("test1");
        System.out.println("test1 = " + test1);


        departService = ExtensionLoader.getExtensionLoader(DepartService.class).getExtension("app-01");

        test1 = departService.print("test2");
        System.out.println("test1 = " + test1);
    }

    private static void testBean(UserService def) {

        i++;
        String s = def.setUserName("小米" + i);
        String userName = def.getUserName();

        System.out.println("setUserName = " + s);
        System.out.println("userName = " + userName);

    }
}
