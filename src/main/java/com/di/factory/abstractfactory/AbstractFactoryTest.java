package com.di.factory.abstractfactory;

import com.di.factory.abstractfactory.impl.MSFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        KMFactory kmFactory = new MSFactory();
        IKeyboard iKeyboard = kmFactory.produceKeyboard();
        IMouse iMouse = kmFactory.produceMouse();
        iKeyboard.create();
        iMouse.create();

    }
}
