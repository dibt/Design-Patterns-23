package com.di.factory.factory.impl;

import com.di.factory.factory.IKeyboard;

public class MSKeyboard implements IKeyboard {
    @Override
    public void create() {
        System.out.println("生产微软牌键盘");
    }
}
