package com.javadesignpatterns.bevavioral.templatemethod.tshirtexample;

public class BlueTshirt extends TShirtTemplate {
    @Override
    public void setColor() {
        System.out.println("Applying blue paint on the shirt");
    }
}
