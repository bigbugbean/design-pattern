package com.bugbean.designpattern.strategy;

import com.bugbean.designpattern.strategy.strategy.FlyStrategy;
import com.bugbean.designpattern.strategy.strategy.TakeOffStrategy;
import com.bugbean.designpattern.strategy.strategy.impl.LongDistanceTakeOff;
import com.bugbean.designpattern.strategy.strategy.impl.SubSonicFly;
import com.bugbean.designpattern.strategy.strategy.impl.SuperSonicFly;
import com.bugbean.designpattern.strategy.strategy.impl.VerticalTakeOff;
import com.bugbean.designpattern.strategy.context.impl.AirPlane;
import com.bugbean.designpattern.strategy.context.impl.Fighter;
import com.bugbean.designpattern.strategy.context.impl.Harrier;
import com.bugbean.designpattern.strategy.context.impl.Helicopter;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-06 19:07
 */
public class App {
    public static void main(String[] args) {

        TakeOffStrategy verticalTakeOff = new VerticalTakeOff();
        TakeOffStrategy longDistanceTakeOff = new LongDistanceTakeOff();

        FlyStrategy subSonicFly = new SubSonicFly();
        FlyStrategy superSonicFly = new SuperSonicFly();

        Helicopter helicopter = new Helicopter();
        helicopter.setTakeOffStrategy(verticalTakeOff);
        helicopter.setFlyStrategy(subSonicFly);
        helicopter.start();

        AirPlane airPlane = new AirPlane();
        airPlane.setTakeOffStrategy(longDistanceTakeOff);
        airPlane.setFlyStrategy(subSonicFly);
        airPlane.start();

        Fighter fighter = new Fighter();
        fighter.setTakeOffStrategy(longDistanceTakeOff);
        fighter.setFlyStrategy(superSonicFly);
        fighter.start();

        Harrier harrier = new Harrier();
        harrier.setTakeOffStrategy(verticalTakeOff);
        harrier.setFlyStrategy(subSonicFly);
        harrier.start();
    }
}
