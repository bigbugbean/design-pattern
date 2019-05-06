package com.bugbean.designpattern.singleton.iodh;

public class LoadBalancer {
    private static LoadBalancer loadBalancer = null;

    private LoadBalancer() {
    }

    public static LoadBalancer getInstance() {
        return LoadBalancerHolder.instance;
    }

    private static class LoadBalancerHolder {
        private final static LoadBalancer instance = new LoadBalancer();
    }
}
