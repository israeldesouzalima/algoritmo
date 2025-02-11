package aula_01_exercicio;

public class Funcionario {
	// atrib.
	public int codFunc;
	public String nome;
	public String cargo;
	public double salarioBruto;
	
	//met.
	public String mostrarDados() {
		return "codigo: "+this.codFunc+".\n Nome: "+this.nome+".\n Cargo: "+this.cargo+". \n Salario: "+this.salarioBruto;
	}
	
	public double calcularSalarioLiquido(double descontoPercentualINSS) {
		return this.salarioBruto - (this.salarioBruto*descontoPercentualINSS);
	}
	
}
