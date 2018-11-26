package com.di.factory.factory;

import com.di.factory.factory.impl.LJFactory;

public class KeyboardFactoryTest {
    public static void main(String[] args) {
        IFactory iFactory = new LJFactory();

        IKeyboard ljKeyboard = iFactory.produce();

        ljKeyboard.create();

    }
}
