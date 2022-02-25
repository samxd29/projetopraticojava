
public class testaContaSemCliente {
	public static void main(String[] args) {
		conta contaPaula = new conta();
		System.out.println(contaPaula.getSaldo());
		
		//colocando a referência contaPaula diretamente na class cliente;
		contaPaula.titular = new Cliente();
		System.out.println(contaPaula.titular);
		
		contaPaula.titular.nome = "Paula";
		System.out.println(contaPaula.titular.nome);
	}
}
