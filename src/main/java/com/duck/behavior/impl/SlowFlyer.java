package com.duck.behavior.impl;

import com.duck.behavior.FlyBehaviour;

public class SlowFlyer implements FlyBehaviour {
    @Override
    public void doFly() {
        System.out.println("Flying Slow....");
    }
}
