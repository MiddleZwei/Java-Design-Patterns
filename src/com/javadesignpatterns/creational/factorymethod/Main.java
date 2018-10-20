package com.javadesignpatterns.creational.factorymethod;

import com.javadesignpatterns.creational.factorymethod.encryptors.Sha256Encryptor;

public class Main {
    public static void main(String[] args) {
        PersistedFile file = new PersistedFile("./src/com/javadesignpatterns/creational/factorymethod/text.txt", "Hello, world!", new Sha256Encryptor());
        file.persist();
    }
}
