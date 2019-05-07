package com.bugbean.designpattern.state;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-07 15:03
 */
public class Play {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();

        player.win();
        player.win();
        player.win();
        player.win();

        player.changeCards();
        player.peekCards();

        player.win();
        player.win();
        player.win();
        player.win();

        player.changeCards();
        player.peekCards();

        player.win();
        player.win();
        player.win();
        player.win();

        player.changeCards();
        player.peekCards();
    }
}
