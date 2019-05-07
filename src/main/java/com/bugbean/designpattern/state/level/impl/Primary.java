package com.bugbean.designpattern.state.level.impl;

import com.bugbean.designpattern.state.Player;
import com.bugbean.designpattern.state.level.Level;
import com.bugbean.designpattern.state.level.enums.LevelEnum;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-07 14:30
 */
public class Primary extends Level {

    public Primary() {
        super.levelEnum = LevelEnum.PRIMARY;
    }

    @Override
    public void doubleScore(Player player) {
        System.err.println(super.levelEnum + " can't double score");
    }

    @Override
    public void changeCards(Player player) {
        System.err.println(super.levelEnum + " can't change cards");
    }

    @Override
    public void peekCards(Player player) {
        System.err.println(super.levelEnum + " can't peek cards");
    }
}
