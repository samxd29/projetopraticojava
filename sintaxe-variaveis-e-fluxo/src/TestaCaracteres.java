public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		
		System.out.println(letra);
		// char é caracteres que quardam valores númericos;
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Meu nome é Samantha";
		System.out.println(palavra);
		// String concatena com outra string ou converte em outra string;
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
