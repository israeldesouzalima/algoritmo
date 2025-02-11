package aula_01_exercicio;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.codFunc = 4554;
		func.nome = "Osvaldo";
		func.cargo = "Administrador";
		func.salarioBruto = 3259.77;
		
		
		System.out.println( func.mostrarDados() );
		System.out.println( func.calcularSalarioLiquido(0.15) );
		

	}

}
