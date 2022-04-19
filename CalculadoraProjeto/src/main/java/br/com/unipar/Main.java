package br.com.unipar;

import br.com.unipar.entities.ScientificCalculator;

public class Main {

    public static void main(String[] args) {
        
        ScientificCalculator calculator = new ScientificCalculator();
        
        System.out.println(calculator.sum(3, 3));
        System.out.println(calculator.subtraction(6, 4));
        System.out.println(calculator.division(14, 8));
        System.out.println(calculator.multiplication(8, 4));
        System.out.println(calculator.squareRoot(11));
        System.out.println(calculator.potency(3, 4));
    }
    
}
