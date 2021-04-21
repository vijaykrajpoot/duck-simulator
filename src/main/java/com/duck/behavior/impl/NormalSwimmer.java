package com.duck.behavior.impl;

import com.duck.behavior.SwimBehaviour;

public class NormalSwimmer implements SwimBehaviour {
    @Override
    public void doSwim() {
        System.out.println("Swimming");
    }
}
