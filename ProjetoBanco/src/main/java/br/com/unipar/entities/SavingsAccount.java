package br.com.unipar.entities;

import java.util.Date;

public class SavingsAccount extends BankingAccount {

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void cashDeposit(double value) {
        super.cashDeposit(value);
    }

    @Override
    public void cashOut(double value) {
        super.cashOut(value);
    }

    @Override
    public void getBankBalanceByDate(Date date) {
        super.getBankBalanceByDate(date);
    }

    @Override
    public void extractByPeriod(Date initialDate, Date finalDate) {
        super.extractByPeriod(initialDate, finalDate);
    }
}
