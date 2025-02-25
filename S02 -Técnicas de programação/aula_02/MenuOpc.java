package aula3;

import javax.swing.JOptionPane;

public class MenuOpc {

	public static void main(String[] args) {
		Banco joaquim = new Banco();
		joaquim.numeroConta = 312;
		joaquim.saldo = 45.98;
		
		Banco maria = new Banco();
		maria.titular = "Maria";
		maria.numeroConta = 12;

		int num;
		String error = "Erro na operação";

		String menu = "Olá, digite a opção desejada. \n" + "1) Atualizar titular \n" + "2) Depositar um valor \n"
				+ "3) Sacar um valor \n" + "4) Consultar dados \n"+ "5) Transferir \n" + "0) Sair do menu \n";

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (num) {
				// Atualizar titular
			case 1:
				joaquim.titular = JOptionPane.showInputDialog("Digite o seu nome");
				break;

				// Depositar
			case 2:
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
				joaquim.depositar(valor);
				break;

				// Sacar
			case 3:
				double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
				if (joaquim.sacar(valorSaque)) {
					JOptionPane.showMessageDialog(null, "Sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, error);
				}
				break;
				// Consultar dados
			case 4:
				JOptionPane.showMessageDialog(null, joaquim.consultar() +  maria.consultar() );
				break;
				
				// Transferir
			case 5:
				double valEnviar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que vai enviar: "));
				JOptionPane.showMessageDialog(null, joaquim.transferir(valEnviar, maria));
				
				break;

				// Sair menu
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo do programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opçõ inválida");
				break;
			}

		} while (num != 0);

	}

}
