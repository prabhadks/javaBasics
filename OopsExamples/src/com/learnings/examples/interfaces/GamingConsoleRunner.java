package com.learnings.examples.interfaces;

public class GamingConsoleRunner {
    public static void main(String[] args) {
        GamingConsole game1 = new Game1();
        GamingConsole game2 = new Game2();
        game1.up();
        game1.down();
        game1.left();
        game1.right();
        game1.stop();

        System.out.println("------------------------------------");
        game2.up();
        game2.down();
        game2.left();
        game2.right();
        game2.stop();
    }
}
