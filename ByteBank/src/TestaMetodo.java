
public class TestaMetodo {
	public static void main(String[] args) {
		conta ContaSam = new conta();
		ContaSam.saldo = 100;
		ContaSam.deposita(50);
		System.out.println(ContaSam.saldo);
		
		ContaSam.saca(20);
		System.out.println(ContaSam.saldo);
		
		conta ContaPaula = new conta();
		ContaPaula.deposita(1000);
		
		ContaPaula.transfere(300, ContaSam);
		System.out.println(ContaPaula.saldo);
		System.out.println(ContaSam.saldo);
		
		ContaSam.titular = "Samantha";
		System.out.println(ContaSam.titular);
	}
}
