package com.bugbean.designpattern.state;

import com.bugbean.designpattern.state.level.Level;
import com.bugbean.designpattern.state.level.impl.Final;
import com.bugbean.designpattern.state.level.impl.Primary;
import com.bugbean.designpattern.state.level.impl.Professional;
import com.bugbean.designpattern.state.level.impl.Secondary;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-07 14:22
 */
public class Player {
    private int score;
    private String[] cards;
    private Level level;

    public Player() {
        this.score = 0;
        this.level = new Primary();
        //随机发11张牌
    }

    private void changeLevel() {
        if (score >= 5 && score < 10) {
            level = new Secondary();
        } else if (score >= 10 && score < 15) {
            level = new Professional();
        } else if (score >= 15) {
            level = new Final();
        } else {
            level = new Primary();
        }
    }

    public void win() {
        score++;
        level.doubleScore(this);
        changeLevel();
        System.out.println(level + " is win, now score is " + score);
    }

    public void lose() {
        if (score > 0) {
            score--;
        }
        changeLevel();
        System.out.println(level + " is lose, now score is " + score);
    }

    public void play() {
        level.play();
    }

    public void changeCards() {
        level.changeCards(this);
    }

    public void peekCards() {
        level.peekCards(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
