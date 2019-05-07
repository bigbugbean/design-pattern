package com.bugbean.designpattern.strategy.strategy.impl;

import com.bugbean.designpattern.strategy.strategy.TakeOffStrategy;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-06 19:04
 */
public class LongDistanceTakeOff implements TakeOffStrategy {
    @Override
    public void takeOff() {
        System.out.println("LongDistanceTakeOff");
    }
}
