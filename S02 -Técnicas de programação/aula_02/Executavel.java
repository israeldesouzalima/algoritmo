  package aula_02;

public class Aula_02 {

	public static void main(String[] args) {
		Banco bc = new Banco();
		
		bc.numeroConta = 112;
		bc.titular = "Fulano";
		bc.saldo = 45.98;
		
		System.out.println("Saldo atual: "+bc.saldo);
				
		bc.depositar(90.55);
		
		if (bc.sacar(136.54)) {
			System.out.println("Sucesso!!");
		} else {
			System.out.println("Não sucedido, tente novamente!");
		}
		
		System.out.println(bc.consultar());
		

		
	}

}
