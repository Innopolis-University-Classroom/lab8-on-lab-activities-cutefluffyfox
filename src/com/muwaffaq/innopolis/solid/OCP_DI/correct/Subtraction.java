package com.muwaffaq.innopolis.solid.OCP_DI.correct;

public class Subtraction implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
