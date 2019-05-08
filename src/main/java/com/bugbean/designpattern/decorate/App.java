package com.bugbean.designpattern.decorate;

import com.bugbean.designpattern.decorate.decorator.ModuloEncryptor;
import com.bugbean.designpattern.decorate.decorator.ReverseOutputEncryptor;
import com.bugbean.designpattern.decorate.impl.SimpleEncryptor;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-05-08 17:35
 */
public class App {
    public static void main(String[] args) {
        Encryptor simpleEncryptor = new SimpleEncryptor();
        simpleEncryptor.encrypt();
        System.out.println("=============================");
        Encryptor reverseOutputEncryptor = new ReverseOutputEncryptor(simpleEncryptor);
        reverseOutputEncryptor.encrypt();
        System.out.println("=============================");
        ModuloEncryptor moduloEncryptor = new ModuloEncryptor(simpleEncryptor);
        moduloEncryptor.encrypt();
        System.out.println("=============================");
        Encryptor zhEncryptor = new ReverseOutputEncryptor(new ModuloEncryptor(new SimpleEncryptor()));
        zhEncryptor.encrypt();
    }
}
