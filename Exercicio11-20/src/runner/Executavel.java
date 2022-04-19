package runner;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Relatorio;

public class Executavel {
   
    public static void main(String[] args) {
        operacoes();
    }
    public static void operacoes(){
        ContaCorrente  c= new ContaCorrente();
        ContaPoupanca  p= new ContaPoupanca();
        
        c.setNumeroDeConta(1234);
        c.depositar(1200);
        
        p.setNumeroDeConta(5678);
        p.depositar(1200); 
        
        p.sacar(1250);  
       
        Relatorio relatorio = new Relatorio();
        
        relatorio.gerarRelatorio(p);
    }   
}
