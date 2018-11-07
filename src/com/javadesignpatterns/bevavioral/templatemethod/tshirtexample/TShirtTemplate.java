package com.javadesignpatterns.bevavioral.templatemethod.tshirtexample;

public abstract class TShirtTemplate {

    //final so subclasses can't override it
    public final void createTshirt(){
        setColor();
        sew();
        attachButtons();
        System.out.println("We've got a T-shirt, yaaay!");
    }

    private void attachButtons() {
        System.out.println("Attaching three buttons");
    }

    private void sew() {
        System.out.println("Sewing parts");
    }

    //will be implemented by subclasses
    public abstract void setColor();

}
