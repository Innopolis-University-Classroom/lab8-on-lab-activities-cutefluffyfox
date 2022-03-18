package com.muwaffaq.innopolis.solid.LSP_IS.correct;

public class Pigeon extends Bird implements CanFly{
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
