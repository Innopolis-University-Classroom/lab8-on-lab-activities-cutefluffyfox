package com.muwaffaq.innopolis.solid.LSP_IS.correct;

public abstract class Bird implements CanEat, CanHatch {
    @Override
    public void eat(){
        System.out.println("eating");
    }

    @Override
    public void hatch(){
        System.out.println("laying eggs");
    }
}
