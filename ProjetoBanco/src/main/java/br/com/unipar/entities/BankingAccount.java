package br.com.unipar.entities;

import br.com.unipar.exception.InsufficientDateException;
import br.com.unipar.exception.InsufficientDepositException;
import br.com.unipar.exception.InsufficientWithdrawalException;
import java.util.Date;

public class BankingAccount {
    
    private double overdraftLimit;
    private double balance;

    public void extractByPeriod(Date initialDate, Date finalDate) {
        if (initialDate == null || finalDate == null) {
            throw new InsufficientDateException();
        }
    }
    
    public void getBankBalanceByDate(Date date) {
        if (date == null) {
            throw new InsufficientDateException();
        }
    }
    
    public void cashOut(double value) {
        this.balance += this.overdraftLimit;
        if (value < 0 || value > balance) {
            throw new InsufficientWithdrawalException();
        }
        
        this.balance -= value;
    }
    
    public void cashDeposit(double value) { 
        if (value <= 0) {
            throw new InsufficientDepositException();
        }
        
        this.balance += value;
    }

    public double getBalance() {
        return this.balance;
    }
    
    

    public double getOverdraftLimit(double value) {
        this.overdraftLimit += value;
        return this.overdraftLimit;
    }
}
