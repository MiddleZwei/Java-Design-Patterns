package com.javadesignpatterns.bevavioral.templatemethod.tshirtexample;

public class Main {
    public static void main(String[] args) {
        TShirtTemplate tShirt = new RedTshirt();
        tShirt.createTshirt();
        System.out.println("-----------------------");

        tShirt = new BlueTshirt();
        tShirt.createTshirt();
        System.out.println("-----------------------");

        tShirt = new GreenTshirt();
        tShirt.createTshirt();
        System.out.println("-----------------------");
    }
}
