package com.learnings.examples.interfaces;

public interface GamingConsole {

    void up();
    void down();
    void left();
    void right();
    default void stop() {
        System.out.println("Default implementation");
    }
}
