package aula_02;

public class Banco {

	public double saldo;
	public String titular;
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
		return "Saldo: " + this.saldo + " -- Titular: " + this.titular + " -- Numero da conta: " + this.numeroConta;
	}

	public void transferir() {

	}

}
