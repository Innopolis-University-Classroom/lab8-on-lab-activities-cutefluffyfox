package com.muwaffaq.innopolis.solid.LSP_IS.correct;

public class Duck extends Bird implements CanSwim, CanFly{

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
