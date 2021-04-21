package com.duck.behavior.impl;

import com.duck.behavior.FlyBehaviour;

public class NoFlyer implements FlyBehaviour {
    @Override
    public void doFly() {
        System.out.println("I can't fly");
    }
}
