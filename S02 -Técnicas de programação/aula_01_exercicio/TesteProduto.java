package aula_01_exercicio;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto pd = new Produto();
		
		pd.nome = "Filé de frango";
		pd.valor = 15.3;
		pd.codigo = 554;
		
		int quantidade = 9;
		
		pd.calcularTotal(8);
		pd.calcularTotal(quantidade);
		
		pd.mostrarDados();

	}

}
