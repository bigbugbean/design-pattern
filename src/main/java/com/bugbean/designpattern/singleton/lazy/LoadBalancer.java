package com.bugbean.designpattern.singleton.lazy;

public class LoadBalancer {
    private static volatile LoadBalancer loadBalancer = null;

    private LoadBalancer() {
    }

    synchronized public static LoadBalancer getInstance() {
        if (loadBalancer == null) {
            synchronized (LoadBalancer.class) {
                if (loadBalancer == null) {
                    loadBalancer = new LoadBalancer();
                }
            }
        }
        return loadBalancer;
    }
}
