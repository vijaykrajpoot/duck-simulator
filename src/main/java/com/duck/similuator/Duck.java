package com.duck.similuator;

import com.duck.behavior.FlyBehaviour;
import com.duck.behavior.QuackBehaviour;
import com.duck.behavior.SwimBehaviour;

abstract public class Duck {

    protected FlyBehaviour flyBehaviour;

    protected QuackBehaviour quackBehaviour;

    protected SwimBehaviour swimBehaviour;


    protected void fly() {
        flyBehaviour.doFly();
    }

    protected void swim() {
        swimBehaviour.doSwim();
    }

    protected void quack() {
        quackBehaviour.doQuack();
    }


}
