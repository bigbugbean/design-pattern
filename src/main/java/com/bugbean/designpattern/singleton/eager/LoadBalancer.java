package com.bugbean.designpattern.singleton.eager;

public class LoadBalancer {

    private static LoadBalancer loadBalancer = new LoadBalancer();

    private LoadBalancer() {
    }

    public static LoadBalancer getInstance() {
        return loadBalancer;
    }
}
