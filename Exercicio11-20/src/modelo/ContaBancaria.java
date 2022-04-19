package modelo;


public abstract class ContaBancaria {
	private int numeroDeConta;
	private double saldo;


	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public int getNumeroDeConta() {
		return numeroDeConta;
	}

	public void setNumeroDeConta(int numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void transferir(double valor, ContaBancaria conta) {
		if (this instanceof ContaCorrente) {
			ContaCorrente cc = ((ContaCorrente) this);
			boolean condicao = (this.getSaldo() - valor - cc.getTaxaDeOperacao()) > 0;
			if (condicao) {
				cc.sacar(valor);
				conta.depositar(valor);
			}
		} else {
			ContaPoupanca cp = ((ContaPoupanca) this);
			boolean condicao = (cp.getSaldo() - valor) >= cp.getLimite();
			if (condicao) {
				cp.sacar(valor);
				conta.depositar(valor);
			}
		}

	}

}
