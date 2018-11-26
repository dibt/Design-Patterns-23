package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IKeyboard;
import com.di.factory.abstractfactory.IMouse;
import com.di.factory.abstractfactory.KMFactory;
import com.di.factory.abstractfactory.impl.MSKeyboard;
import com.di.factory.abstractfactory.impl.MSMouse;

public class MSFactory implements KMFactory {
    @Override
    public IKeyboard produceKeyboard() {
        return new MSKeyboard();
    }

    @Override
    public IMouse produceMouse() {
        return new MSMouse();
    }
}
