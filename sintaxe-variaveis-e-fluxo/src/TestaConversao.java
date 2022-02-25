public class TestaConversao {
	public static void main(String[] args) {
		// double que aceita números inteiros e decimais;
		double salario = 1250.70;
		// int somente números inteiros;
		int valor = (int) salario;
		// int() entre parenteses vc dá um cast, ou seja informa a variável que vc quer o resultado como um inteiro;
		System.out.println(valor);
	}
}
