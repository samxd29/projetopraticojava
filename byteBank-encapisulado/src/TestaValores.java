
public class TestaValores {
	public static void main(String[] args) {
		conta Conta = new conta(1335, 50);
		
		// como regra colocamos que não pode valor igual ou menor que zero, mas se chamarmos a agencia o valor default dela é zero;
		System.out.println(Conta.getAgencia());
		
		conta Conta2 = new conta(1335, 26673);
		
		System.out.println(conta.getTotal());
	}
}
