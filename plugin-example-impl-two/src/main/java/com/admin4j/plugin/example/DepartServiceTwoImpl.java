package com.admin4j.plugin.example;

import com.admin4j.plugin.example.api.DepartService;

/**
 * @author andanyang
 * @since 2023/4/25 9:55
 */
public class DepartServiceTwoImpl implements DepartService {

    @Override
    public String print(String name) {
        System.out.println("print" + name);
        System.out.println("DepartService impl" + this.getClass().getName());
        return this.getClass().getName();
    }
}
