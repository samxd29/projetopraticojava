
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente sam = new Gerente();
		sam.setNome("Samantha Carvalho");
		sam.setCpf("119486176-84");
		sam.setSalario(2600);
		
		System.out.println(sam.getNome());
		System.out.println(sam.getBonificacao());
		
		//sam.salario = 300.0;
	}
}
