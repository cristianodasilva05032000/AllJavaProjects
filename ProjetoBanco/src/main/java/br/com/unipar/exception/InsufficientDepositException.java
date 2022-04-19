package br.com.unipar.exception;

public class InsufficientDepositException extends RuntimeException{
    
    public InsufficientDepositException() {
        super ("Não é possível fazer depósito com valor menor que 0,00!");
    }
}
