package com.di.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil {
    public  Map<String,String> getProperties(){
        Map<String,String> map = new HashMap<>();
        Properties properties = new Properties();
        InputStream in = getClass().getResourceAsStream("type.properties");
        try {
            properties.load(in);
            Enumeration enumeration = properties.propertyNames();
            while(enumeration.hasMoreElements()){
                String key = (String)enumeration.nextElement();
                String value = properties.getProperty(key);
                map.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
