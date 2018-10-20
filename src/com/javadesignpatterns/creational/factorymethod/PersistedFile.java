package com.javadesignpatterns.creational.factorymethod;

public class PersistedFile {
    private final String path;
    private final String contents;
    private final Encryptor encryptor;

    public PersistedFile(String path, String contents, Encryptor encryptor) {
        this.path = path;
        this.contents = contents;
        this.encryptor = encryptor;
    }

    public void persist(){
        this.encryptor.writeToDisk(contents, path);
    }


}
