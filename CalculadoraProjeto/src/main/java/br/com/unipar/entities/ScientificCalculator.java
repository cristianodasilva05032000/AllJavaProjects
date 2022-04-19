package br.com.unipar.entities;

public class ScientificCalculator extends Calculator{

    @Override
    public double multiplication(double valueOne, double valueTwo) {
        return super.multiplication(valueOne, valueTwo); 
    }

    @Override
    public double division(double valueOne, double valueTwo) {
        return super.division(valueOne, valueTwo);
    }

    @Override
    public double subtraction(double valueOne, double valueTwo) {
        return super.subtraction(valueOne, valueTwo);
    }

    @Override
    public double sum(double valueOne, double valueTwo) {
        return super.sum(valueOne, valueTwo);
    }
    
    public double squareRoot(double valueOne) {
        return Math.sqrt(valueOne);
    }
    
    public double potency(double valueOne, double valueTwo) {
        return Math.pow(valueOne, valueTwo);
    }   
}
