package com.bugbean.designpattern.decorate.impl;

import com.bugbean.designpattern.decorate.Encryptor;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 17:27
 */
public class SimpleEncryptor implements Encryptor {
    @Override
    public void encrypt() {
        System.out.println("简单加密");
    }
}
