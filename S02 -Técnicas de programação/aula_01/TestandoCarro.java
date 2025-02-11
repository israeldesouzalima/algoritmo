package aula_01;

public class TestandoCarro {

	public static void main(String[] args) {
		// instanciar o objeto		
		Carro uno = new Carro();
		
		// atribuir valores
		uno.placa = "84F5G32";
		uno.numChassi = 85657690;
		System.out.println("Placa: +"+ uno.placa);
		System.out.println();
		System.out.println( uno.acelerar() );
		System.out.println( uno.freiar()   );

	}

}
