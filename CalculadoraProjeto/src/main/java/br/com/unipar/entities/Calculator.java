package br.com.unipar.entities;

public abstract class Calculator {
    
    protected double result;
    
    public double sum(double valueOne, double valueTwo) {
        return result = valueOne + valueTwo;
    }
    
    public double subtraction(double valueOne, double valueTwo) {
        return result = valueOne - valueTwo;
    }
    
    public double division(double valueOne, double valueTwo) {
        return result = valueOne / valueTwo;
    }
    
    public double multiplication(double valueOne, double valueTwo) {
        return result = valueOne * valueTwo;
    }   
}
