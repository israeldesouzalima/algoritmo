package exercicio5;

public class Funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;
	public boolean estaNaEmpresa;
	
	public double recebeAumento (double aumento) {
		return this.salario += this.salario * ( aumento / 100 );
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	
}
