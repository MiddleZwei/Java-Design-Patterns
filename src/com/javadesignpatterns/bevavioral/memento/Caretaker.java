package com.javadesignpatterns.bevavioral.memento;

public class Caretaker {

    private Object obj;

    public void save(Originator originator){
        this.obj = originator.save();
    }

    public void undo(Originator writer){
        writer.undoToLastSave(obj);
    }
}
