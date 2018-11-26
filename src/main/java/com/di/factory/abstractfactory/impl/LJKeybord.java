package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IKeyboard;

public class LJKeybord implements IKeyboard {
    @Override
    public void create() {
        System.out.println("生产罗技牌键盘");
    }
}
