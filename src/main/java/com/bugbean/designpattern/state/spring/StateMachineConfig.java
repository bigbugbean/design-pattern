package com.bugbean.designpattern.state.spring;

import com.bugbean.designpattern.state.level.enums.EventEnum;
import com.bugbean.designpattern.state.level.enums.LevelEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 9:54
 */
@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<LevelEnum, EventEnum> {

    @Autowired
    private StateMachineEventConfig stateMachineEventConfig;

    @Override
    public void configure(StateMachineStateConfigurer<LevelEnum, EventEnum> states)
            throws Exception {

        states
                .withStates()
                .initial(LevelEnum.PRIMARY)
                .states(EnumSet.allOf(LevelEnum.class));

    }

    @Override
    public void configure(StateMachineTransitionConfigurer<LevelEnum, EventEnum> transitions)
            throws Exception {

        transitions
                .withExternal()
                .source(LevelEnum.PRIMARY)
                .target(LevelEnum.SECONDARY)
                .event(EventEnum.UPGRADE)
                .and()
                .withExternal()
                .source(LevelEnum.SECONDARY)
                .target(LevelEnum.PROFESSIONAL)
                .event(EventEnum.UPGRADE)
                .and()
                .withExternal()
                .source(LevelEnum.PROFESSIONAL)
                .target(LevelEnum.FINAL)
                .event(EventEnum.UPGRADE)
                .and()
                .withExternal()
                .source(LevelEnum.FINAL)
                .target(LevelEnum.PROFESSIONAL)
                .event(EventEnum.DEMOTION)
                .and().withExternal()
                .source(LevelEnum.PROFESSIONAL)
                .target(LevelEnum.SECONDARY)
                .event(EventEnum.DEMOTION)
                .and()
                .withExternal()
                .source(LevelEnum.SECONDARY)
                .target(LevelEnum.PRIMARY)
                .event(EventEnum.DEMOTION);

    }

    /*@Override
    public void configure(StateMachineConfigurationConfigurer<LevelEnum, EventEnum> config)
            throws Exception {
        config
                .withConfiguration()
                .listener(stateMachineEventConfig);
    }*/

    /*@Bean
    public StateMachineListener<LevelEnum, EventEnum> listener() {
        return new StateMachineListenerAdapter<LevelEnum, EventEnum>() {
            @Override
            public void transition(Transition<LevelEnum, EventEnum> transition) {
                if (transition.getTarget().getId() == LevelEnum.PRIMARY) {
                    System.out.println("晋升为初级");
                } else if (transition.getSource().getId() == LevelEnum.PRIMARY && transition.getTarget().getId() == LevelEnum.SECONDARY) {
                    System.out.println("晋升为中级");
                } else if (transition.getSource().getId() == LevelEnum.SECONDARY && transition.getTarget().getId() == LevelEnum.PROFESSIONAL) {
                    System.out.println("晋升为高级");
                } else if (transition.getSource().getId() == LevelEnum.PROFESSIONAL && transition.getTarget().getId() == LevelEnum.FINAL) {
                    System.out.println("晋升为骨灰级");
                }
            }
        };
    }*/

}
