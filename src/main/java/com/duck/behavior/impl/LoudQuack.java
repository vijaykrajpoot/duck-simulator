package com.duck.behavior.impl;

import com.duck.behavior.QuackBehaviour;

public class LoudQuack implements QuackBehaviour {
    @Override
    public void doQuack() {
        System.out.println("Loud Quack...");
    }
}
