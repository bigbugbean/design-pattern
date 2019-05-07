package com.bugbean.designpattern.strategy.strategy.impl;

import com.bugbean.designpattern.strategy.strategy.FlyStrategy;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-06 19:05
 */
public class SuperSonicFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("SuperSonicFly");
    }
}
