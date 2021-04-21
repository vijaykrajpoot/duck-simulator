package com.duck.similuator;

import com.duck.behavior.impl.*;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RubberDuck(new NoFlyer(), new MuteQuack(), new SlowSwimmer());
        duck.fly();
        duck.quack();
        duck.swim();


        System.out.println("==========================");

        Duck d1 = new RealDuck(new RealFly(), new LoudQuack(), new NormalSwimmer());
        d1.fly();
        d1.quack();
        d1.swim();
    }
}
