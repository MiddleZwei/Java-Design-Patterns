package com.javadesignpatterns.bevavioral.templatemethod.tshirtexample;

public class GreenTshirt extends TShirtTemplate {
    @Override
    public void setColor() {
        System.out.println("Applying green paint on the shirt");
    }
}
