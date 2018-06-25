package com.di.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PeopleFactory peopleFactory = new HNFactory();
        IBoy boy=peopleFactory.getBoy();
        boy.drawBoy();
    }
}
