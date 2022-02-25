
public class testaSacaNegativos {
	public static void main(String[] args) {
		// Class - variavél;
		conta Conta = new conta();
		Conta.deposita(100);
		System.out.println(Conta.saca(101));
		
		Conta.saca(101);
		System.out.println(Conta.getSaldo());
	}
}
