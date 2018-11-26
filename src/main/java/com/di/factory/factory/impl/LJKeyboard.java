package com.di.factory.factory.impl;

import com.di.factory.factory.IKeyboard;

/**
 * @author povosdi
 * @date 2018/11/26
 */
public class LJKeyboard implements IKeyboard {
    @Override
    public void create() {
        System.out.println("生产罗技牌键盘");
    }
}
