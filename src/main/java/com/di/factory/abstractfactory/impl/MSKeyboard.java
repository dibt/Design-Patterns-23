package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IKeyboard;

public class MSKeyboard implements IKeyboard {
    @Override
    public void create() {
        System.out.println("生产微软牌键盘");
    }
}
