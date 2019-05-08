package com.bugbean.designpattern.state.spring;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 10:42
 */
@WithStateMachine
public class StateMachineEventConfig {

    @OnTransition(target = "PRIMARY")
    public void init() {
        System.out.println("初始化为初级");
    }

    @OnTransition(source = "PRIMARY", target = "SECONDARY")
    public void upgradeToSecondary() {
        System.out.println("晋升为中级");
    }

    @OnTransition(source = "SECONDARY", target = "PROFESSIONAL")
    public void upgradeToProfessional() {
        System.out.println("晋升为高级");
    }

    @OnTransition(source = "PROFESSIONAL", target = "FINAL")
    public void upgradeToFinal() {
        System.out.println("晋升为骨灰级");
    }
}
