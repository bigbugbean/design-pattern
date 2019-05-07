package com.bugbean.designpattern.strategy.strategy.impl;

import com.bugbean.designpattern.strategy.strategy.TakeOffStrategy;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-06 18:59
 */
public class VerticalTakeOff implements TakeOffStrategy {
    @Override
    public void takeOff() {
        System.out.println("VerticalTakeOff");
    }
}
