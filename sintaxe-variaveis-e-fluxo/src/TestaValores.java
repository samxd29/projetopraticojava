public class TestaValores {
	public static void main(String[] args) {
		System.out.println("Testando as Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� � de menor, por�m est� acompanhado de outras pessoas e por isso pode entrar");
			} else {
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}
	