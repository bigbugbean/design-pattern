package com.bugbean.designpattern.decorate.decorator;

import com.bugbean.designpattern.decorate.Encryptor;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 17:29
 */
public class EncryptorDecorator implements Encryptor {
    private Encryptor encryptor;

    public EncryptorDecorator(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    @Override
    public void encrypt() {
        encryptor.encrypt();
    }
}
