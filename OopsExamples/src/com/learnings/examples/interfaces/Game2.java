package com.learnings.examples.interfaces;

public class Game2 implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Game2 moving up");
    }

    @Override
    public void down() {
        System.out.println("Game2 moving down");
    }

    @Override
    public void left() {
        System.out.println("Game2 moving left");
    }

    @Override
    public void right() {
        System.out.println("Game2 moving down");
    }

}
