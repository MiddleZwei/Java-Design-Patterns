package com.javadesignpatterns.creational.factorymethod.encryptors;

import com.javadesignpatterns.creational.factorymethod.EncryptionAlgorithm;
import com.javadesignpatterns.creational.factorymethod.Encryptor;
import com.javadesignpatterns.creational.factorymethod.algorithms.Sha512EncryptionAlgorithm;

public class Sha512Encryptor extends Encryptor {
    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha512EncryptionAlgorithm();
    }
}
