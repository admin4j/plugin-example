package com.admin4j.plugin.example.api;

import com.admin4j.api.anno.SPI;

/**
 * @author andanyang
 * @since 2023/4/25 9:54
 */
@SPI("def")
public interface DepartService {

    String print(String name);
}
