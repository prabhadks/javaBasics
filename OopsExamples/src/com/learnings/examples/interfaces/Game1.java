package com.learnings.examples.interfaces;

public class Game1 implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Game1 moving up");
    }

    @Override
    public void down() {
        System.out.println("Game1 moving down");
    }

    @Override
    public void left() {
        System.out.println("Game1 moving left");
    }

    @Override
    public void right() {
        System.out.println("Game1 moving down");
    }

    @Override
    public void stop() {
        System.out.println("Game1 stopping");
    }
}
