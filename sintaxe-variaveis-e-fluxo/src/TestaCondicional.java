
public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println("Testando as Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhantes = quantidadePessoas >= 2;
		System.out.println("Valor do acompanhantes " + acompanhantes);
		if (idade >= 18 && acompanhantes) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente voc? n?o pode entrar");
		}
		// if (idade >= 18 || quantidadePessoas>=2) {
		// System.out.println("Seja Bem-vindo!");
		// }else {
		// System.out.println("Voc? n?o pode entrar");
		// }
	}
	// Podemos utilizar o && ou || as condicionais;
}

