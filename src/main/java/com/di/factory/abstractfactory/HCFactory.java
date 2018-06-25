package com.di.factory.abstractfactory;

public class HCFactory implements PeopleFactory{
    @Override
    public IBoy getBoy() {
        return new HCBoy();
    }

    @Override
    public IGirl getGirl() {
        return new HCGirl();
    }
}
