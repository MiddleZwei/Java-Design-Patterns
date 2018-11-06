package com.javadesignpatterns.bevavioral.memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator writer = new Originator("file.txt");

        writer.write(" (1) Hey, John!");
        System.out.println(writer+"\n\n");

        //save the file
        caretaker.save(writer);
        //write smth else
        writer.write(" (2) Hey, Anna!");

        //check the contents
        System.out.println(writer+"\n\n");

        //undo the last
        caretaker.undo(writer);

        //check again
        System.out.println(writer+"\n\n");

    }
}
