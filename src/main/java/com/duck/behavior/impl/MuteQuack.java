package com.duck.behavior.impl;

import com.duck.behavior.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void doQuack() {
        System.out.println("I can't quack");
    }
}
