package exercicio5;

public class FuncionarioRodar {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.nome = "Joao";
		joao.rg = "14.250.101-3";
		joao.salario = 2500.00;
		joao.dataEntrada = "01/02/2024";
		joao.estaNaEmpresa = true;
		joao.departamento = "Administraçõ";

		System.out.println(joao.nome);
		System.out.println("Ganho anual: " + joao.calculaGanhoAnual() );
		System.out.println("Aumento ganho de: " + joao.recebeAumento(15) );
	}

}
