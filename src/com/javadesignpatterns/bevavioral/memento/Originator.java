package com.javadesignpatterns.bevavioral.memento;

public class Originator {

    private String path;
    private StringBuilder editorContents;

    public Originator(String path) {
        this.path = path;
        this.editorContents = new StringBuilder();
    }

    @Override
    public String toString(){
        return this.editorContents.toString();
    }

    public void write(String str){
        editorContents.append(str);
    }

    public Memento save(){
        return new Memento(this.path, this.editorContents);
    }

    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.path = memento.path;
        this.editorContents = memento.editorState;
    }


    private class Memento {

        private final StringBuilder editorState;
        private String path;

        public Memento(String path, StringBuilder state) {
            this.path = path;
            this.editorState = new StringBuilder(state); // so that they don't refer to the same object
        }

        public StringBuilder getSavedState() {
            return editorState;
        }

    }
}
