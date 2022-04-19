package br.com.unipar.exception;

public class InsufficientDateException extends RuntimeException {
    
    public InsufficientDateException() {
        super ("Não é possível obter resultado com a data nula!");
    }
}
