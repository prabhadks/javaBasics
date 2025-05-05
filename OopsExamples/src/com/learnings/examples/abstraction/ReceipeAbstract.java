package com.learnings.examples.abstraction;

public abstract class ReceipeAbstract {

    public void execute() {
        setup();
        prepare();
        cleanup();
    }

    public abstract void setup();
    public abstract void prepare();
    public abstract void cleanup();
}
