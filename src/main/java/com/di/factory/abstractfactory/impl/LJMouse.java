package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IMouse;

public class LJMouse implements IMouse {
    @Override
    public void create() {
        System.out.println("生产罗技牌鼠标");
    }
}
