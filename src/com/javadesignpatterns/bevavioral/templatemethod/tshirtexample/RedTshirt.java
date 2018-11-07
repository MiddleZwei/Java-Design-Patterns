package com.javadesignpatterns.bevavioral.templatemethod.tshirtexample;

public class RedTshirt extends TShirtTemplate {
    @Override
    public void setColor() {
        System.out.println("Applying red paint on the shirt");
    }
}
