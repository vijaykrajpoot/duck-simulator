package com.duck.similuator;

import com.duck.behavior.FlyBehaviour;
import com.duck.behavior.QuackBehaviour;
import com.duck.behavior.SwimBehaviour;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, SwimBehaviour noSwimmer) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = noSwimmer;
    }
}
