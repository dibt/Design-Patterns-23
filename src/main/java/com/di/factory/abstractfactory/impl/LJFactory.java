package com.di.factory.abstractfactory.impl;

import com.di.factory.abstractfactory.IKeyboard;
import com.di.factory.abstractfactory.IMouse;
import com.di.factory.abstractfactory.KMFactory;
import com.di.factory.abstractfactory.impl.LJKeybord;
import com.di.factory.abstractfactory.impl.LJMouse;

public class LJFactory implements KMFactory {
    @Override
    public IKeyboard produceKeyboard() {
        return new LJKeybord();
    }

    @Override
    public IMouse produceMouse() {
        return new LJMouse();
    }
}
