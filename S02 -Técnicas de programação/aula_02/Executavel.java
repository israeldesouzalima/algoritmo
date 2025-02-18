  package aula_02;
  import javax.swing.JOptionPane;
  
public class Aula_02 {

	public static void main(String[] args) {
		Banco bc = new Banco();
		
		bc.numeroConta = 112;
		bc.titular = "Fulano";
		bc.saldo = 45.98;
		
		JOptionPane.showMessageDialog(null, "Saldo Inicial: "+bc.saldo);
		
		bc.depositar(90.55);
		
		if (bc.sacar(136.50)) {
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Saque não sucedido, tente novamente!");
		}
		
		JOptionPane.showMessageDialog(null, "Saldo atual: "+bc.saldo);
		
		
		

		
	}

}
