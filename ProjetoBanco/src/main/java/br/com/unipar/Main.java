package br.com.unipar;

import br.com.unipar.entities.CheckingAccount;
import br.com.unipar.entities.SavingsAccount;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        
        Date dataUm = new Date(13/10/2021);
        Date dataDois = new Date(14/11/2021);
        
        
        try {           
            checkingAccount.getOverdraftLimit(650);
            checkingAccount.extractByPeriod(dataUm, dataDois);
            checkingAccount.getBankBalanceByDate(dataUm);
            checkingAccount.cashDeposit(75);
            checkingAccount.cashOut(485);

            savingsAccount.extractByPeriod(dataUm, dataDois);
            savingsAccount.getBankBalanceByDate(dataUm);
            savingsAccount.cashDeposit(550);
            savingsAccount.cashOut(260);
            
            System.out.println(savingsAccount.getBalance());
            System.out.println(checkingAccount.getBalance());

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
}
