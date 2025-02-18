package aula_02;

import javax.swing.JOptionPane;

public class MenuOpcs {

	public static void main(String[] args) {
		Banco bc = new Banco();
		bc.numeroConta = 312;
		bc.saldo = 45.98;

		int num;

		String menu = "Olá, digite a opção desejada. \n" + "1) Atualizar titular \n" + "2) Depositar um valor \n"
				+ "3) Sacar um valor \n" + "4) Consultar dados \n" + "0) Sair do menu \n";

		do {

			num = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (num) {

			case 1:
				bc.titular = JOptionPane.showInputDialog("Digite o seu nome");
				break;
			case 2:
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
				bc.depositar(valor);
				break;
			case 3:
				double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
				bc.sacar(valorSaque);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, bc.consultar());
				break;
			case 0:
				break;
			default:
				break;
			}

		} while (num != 0);

	}

}
