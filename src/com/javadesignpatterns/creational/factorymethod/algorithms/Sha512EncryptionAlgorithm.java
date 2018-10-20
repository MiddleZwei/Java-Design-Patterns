package com.javadesignpatterns.creational.factorymethod.algorithms;

import com.javadesignpatterns.creational.factorymethod.EncryptionAlgorithm;
import org.apache.commons.codec.digest.DigestUtils;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha512Hex(plaintext);
    }
}
