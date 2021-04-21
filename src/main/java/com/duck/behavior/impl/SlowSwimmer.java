package com.duck.behavior.impl;

import com.duck.behavior.SwimBehaviour;

public class SlowSwimmer implements SwimBehaviour {
    @Override
    public void doSwim() {
        System.out.println("Slow swimmer");
    }
}
