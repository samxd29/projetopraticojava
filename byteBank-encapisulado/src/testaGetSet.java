
public class testaGetSet {
	public static void main(String[] args) {
		conta Conta = new conta(1335,50);
		
		
		Cliente Paulo = new Cliente();
		Conta.setTitular(Paulo);
		
		Paulo.setNome("Paulo Silveira");
		
		System.out.println(Conta.getTitular().getNome());
		
		Conta.getTitular().setProfissao("programador");
		
		System.out.println(Conta.getTitular().getProfissao());
	}
}
