package com.muwaffaq.innopolis.solid.OCP_DI.correct;

public class Addition implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
