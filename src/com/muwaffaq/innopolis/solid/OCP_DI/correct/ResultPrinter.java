package com.muwaffaq.innopolis.solid.OCP_DI.correct;
import com.muwaffaq.innopolis.solid.OCP_DI.correct.Calculator;


public class ResultPrinter {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 10);
        System.out.println(calc.calculate(new Addition()));
        System.out.println(calc.calculate(new Subtraction()));
    }
}
