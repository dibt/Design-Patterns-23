package com.di.factory.abstractfactory;

public class HNFactory implements PeopleFactory {
    @Override
    public IBoy getBoy() {
        return new HNBoy();
    }

    @Override
    public IGirl getGirl() {
        return  new HNGirl();
    }
}
