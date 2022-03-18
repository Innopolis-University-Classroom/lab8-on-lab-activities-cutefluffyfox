package com.muwaffaq.innopolis.solid.LSP_IS.correct;

public class Penguin extends Bird implements CanSwim{
    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
