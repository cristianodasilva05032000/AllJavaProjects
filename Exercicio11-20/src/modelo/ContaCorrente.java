package modelo;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    
    private  final double taxaDeOperacao=5;
    
    @Override
    public void sacar(double valor){
        if( super.getSaldo() >= (valor+taxaDeOperacao) ){
            super.setSaldo(super.getSaldo()-valor-taxaDeOperacao);
            JOptionPane.showMessageDialog(null,"Levantamento efectuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O levantamento nao pode ser efectuado");
        }
    }
    
    @Override
    public void depositar(double valor){
        if((super.getSaldo()-taxaDeOperacao+valor)>=0){
            super.setSaldo(super.getSaldo()+valor-taxaDeOperacao);  
            JOptionPane.showMessageDialog(null,"Deposito efectuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O deposito nao pode ser efectuado");
        }
    }
    
    @Override
    public void mostrarDados() {
        String dados="Numero da conta: "+super.getNumeroDeConta()+"\n"+
                "Saldo actual: "+super.getSaldo()+"\n"+
                "Taxa de operacao: "+ this.taxaDeOperacao+
                "\n";
        JOptionPane.showMessageDialog(null,dados);
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
    
    
    
}
