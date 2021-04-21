package com.duck.similuator;

import com.duck.behavior.FlyBehaviour;
import com.duck.behavior.QuackBehaviour;
import com.duck.behavior.SwimBehaviour;

public class RealDuck extends Duck {
    public RealDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, SwimBehaviour swimBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
    }
}
