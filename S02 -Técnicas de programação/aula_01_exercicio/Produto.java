package aula_01_exercicio;

public class Produto {
	//atributos
	public int codigo;
	public String nome;
	public double valor;
	
	// metodos
	public String mostrarDados() {
		return this.nome;
	}
	
	public double calcularTotal(int qtdd) {
		return this.valor*qtdd;
	}
}
