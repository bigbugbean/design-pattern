package com.bugbean.designpattern.decorate.decorator;

import com.bugbean.designpattern.decorate.Encryptor;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 17:33
 */
public class ModuloEncryptor extends EncryptorDecorator {
    public ModuloEncryptor(Encryptor encryptor) {
        super(encryptor);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        System.out.println("求模加密");
    }
}
