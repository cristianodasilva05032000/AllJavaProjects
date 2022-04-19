package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import modelo.ContaBancaria;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Imprimivel;

public class Banco implements Imprimivel{
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    int totalContas = contas.size();
    
    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public Banco() {
    }
    /**
     * Metodo que serve para adicionar uma nova conta 
     * @param cb
     */
    public void inserir(ContaBancaria cb){
        contas.add(cb);
        JOptionPane.showMessageDialog(null,"Conta adicionada com sucesso \n"+ "O seu numero de conta é :"+(contas.size()-1));
    }
    /**
     * Metodo que remove uma dada conta
     * @param cb
     * @return 
     */
    public boolean remover(ContaBancaria cb){
        contas.remove(cb);
       return true;        
    }
    
    /**
     * Metodo que faz a pesquisa de contas 
     * @param numeroConta
     * @return 
     */
    public ContaBancaria procuraConta(int numeroConta){
        
        for(int i=0; i< contas.size(); i++)
            if(contas.get(i).getNumeroDeConta()==numeroConta)
                return contas.get(i);
        
        return null;    
        
    }
    /**
     * Metodo que mostra dados de todas as contas disponiveis
     */
    @Override
    public void mostrarDados() {
        contas.forEach(n->{
            if(n instanceof ContaCorrente){
                ((ContaCorrente)n).mostrarDados();
            }else{
                ((ContaPoupanca)n).mostrarDados();
            }
        });
      
    }
    /**
     * Metodo que prepara os dados das contas para serem introduzidos na tabela 
     */
    public ArrayList<Object> dados(ArrayList<Object> lista){
        for(int i=0 ; i<contas.size();i++){
            if(contas.get(i) instanceof ContaCorrente){
                lista.add(new Object[]{
                    contas.get(i).getNumeroDeConta(),
                    "Conta corrente",
                    contas.get(i).getSaldo()
            });
            }else{
                lista.add(new Object[]{
                    contas.get(i).getNumeroDeConta(),
                    "Conta poupanca",
                    contas.get(i).getSaldo()
                });
            }
        }
    
        return lista;
    }
    
    
}
