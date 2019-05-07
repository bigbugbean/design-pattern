package com.bugbean.designpattern.strategy.context;

import com.bugbean.designpattern.strategy.strategy.FlyStrategy;
import com.bugbean.designpattern.strategy.strategy.TakeOffStrategy;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-06 18:50
 */
public abstract class Plane {
    private FlyStrategy flyStrategy;
    private TakeOffStrategy takeOffStrategy;

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setTakeOffStrategy(TakeOffStrategy takeOffStrategy) {
        this.takeOffStrategy = takeOffStrategy;
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void takeOff() {
        takeOffStrategy.takeOff();
    }

    public void start() {
        takeOff();
        fly();
    }
}
