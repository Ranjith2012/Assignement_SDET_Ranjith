package com.automations.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
    static Properties pro;

    public static void initialProperties(){
        pro = new Properties();
        try {
            pro.load(new FileInputStream("src/test/resources/config/configure.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getConfigFile(String key){
        return pro.getProperty(key);
    }


    public static void getConfigValue(String key, String value){
        pro.getProperty(key,value);
    }
}
