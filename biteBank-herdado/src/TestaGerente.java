//polimorfismo Por exemplo, se existir uma classe Gerente que seja filha de Funcionario, um objeto do tipo Gerente pode ser 
//referenciado com o tipo Funcionario também.
//Temos polimorfismo quando uma classe extende de outra ou também quando uma classe implementa uma interface.
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Josimar");
		gerente1.setCpf("23478990");
		gerente1.setSalario(5000.0);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		gerente1.setSenha(2254);
		boolean autenticou = gerente1.autentica(2254);
		 //senha retornou false pois ele inicializa zero;
		
		System.out.println(autenticou);
		
		System.out.println(gerente1.getBonificacao());
		
		
	}
}
