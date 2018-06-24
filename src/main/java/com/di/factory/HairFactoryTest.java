package com.di.factory;

public class HairFactoryTest {
    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
        IHair hair = hairFactory.getHairByName("left");
        hair.draw();

    }
}
