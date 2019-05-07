package com.bugbean.designpattern.state.level;

import com.bugbean.designpattern.state.Player;
import com.bugbean.designpattern.state.level.enums.LevelEnum;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-07 14:22
 */
public abstract class Level {
    protected LevelEnum levelEnum;

    public void play() {
        System.out.println(levelEnum + " play");
    }

    public abstract void doubleScore(Player player);

    public abstract void changeCards(Player player);

    public abstract void peekCards(Player player);

    @Override
    public String toString() {
        return levelEnum.toString();
    }
}
