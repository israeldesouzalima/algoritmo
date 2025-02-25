package aula3;

public class Banco {

	public double saldo;
	public Cliente titular = new Cliente();
	public int numeroConta;

	public void depositar(double value) {
		this.saldo += value;
	}

	public boolean sacar(double value) {
		if ( this.saldo >= value && value > 0  ) {
			this.saldo -= value;
			return true;
		} else {
			return false;
		}
	}

	public String consultar() {
		return "\n Saldo: " + this.saldo + " -- Titular: " + this.titular.nome + " -- Numero da conta: " + this.numeroConta;
	}

	public boolean transferir(double valor, Banco outraConta) {

		if (this.sacar(valor)) {
			outraConta.depositar(valor);
			return true;
		} else {
			return false;
		}
		
	}

}
