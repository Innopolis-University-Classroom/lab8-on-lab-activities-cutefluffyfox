package com.muwaffaq.innopolis.solid.OCP_DI.correct;
import com.muwaffaq.innopolis.solid.OCP_DI.correct.Operation;


public class Calculator {
    public double first, second;

    public Calculator(double first, double second){
        this.first = first;
        this.second = second;
    }

    public double calculate(Operation current){
        return current.calculate(first, second);
    }
}
