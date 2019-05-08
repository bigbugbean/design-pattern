package com.bugbean.designpattern;

import com.bugbean.designpattern.state.level.enums.EventEnum;
import com.bugbean.designpattern.state.level.enums.LevelEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

    @Autowired
    private StateMachine<LevelEnum, EventEnum> stateMachine;

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        stateMachine.sendEvent(EventEnum.UPGRADE);
        stateMachine.sendEvent(EventEnum.UPGRADE);
    }
}
