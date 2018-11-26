package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IMouse;

public class MSMouse implements IMouse {
    @Override
    public void create() {
        System.out.println("生产微软牌鼠标");
    }
}
