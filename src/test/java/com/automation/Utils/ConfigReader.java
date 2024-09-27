package com.automation.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static void initConfig(){
        prop=new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/Config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getConfigProperty(String key){
        return prop.getProperty(key);
    }

}
