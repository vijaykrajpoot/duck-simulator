package com.duck.behavior.impl;

import com.duck.behavior.SwimBehaviour;

public class NoSwimmer implements SwimBehaviour {
    @Override
    public void doSwim() {
        System.out.println("Can't swim");
    }
}
