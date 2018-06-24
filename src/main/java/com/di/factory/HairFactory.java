package com.di.factory;

import java.util.Map;

public class HairFactory {
    public IHair getHairByName(String key){
        Map<String,String> map =  new PropertiesUtil().getProperties();
        try {
            IHair hair = (IHair) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
