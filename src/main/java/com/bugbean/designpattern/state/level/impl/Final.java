package com.bugbean.designpattern.state.level.impl;

import com.bugbean.designpattern.state.Player;
import com.bugbean.designpattern.state.level.Level;
import com.bugbean.designpattern.state.level.enums.LevelEnum;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-07 14:33
 */
public class Final extends Level {
    public Final() {
        super.levelEnum = LevelEnum.FINAL;
    }

    @Override
    public void doubleScore(Player player) {
        player.setScore(player.getScore() + 1);
        System.out.println(super.levelEnum + " double score, now score is " + player.getScore());
    }

    @Override
    public void changeCards(Player player) {
        System.out.println(super.levelEnum + " is change cards");
    }

    @Override
    public void peekCards(Player player) {
        System.out.println(super.levelEnum + " is peek cards");
    }
}
