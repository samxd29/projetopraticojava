
public class TestaContaExcecao {
	public static void main(String[] args) throws MinhaExcecao {
		Conta c = new Conta();
		c.deposita();
		Object c1 = new Conta();
		c1=new String("10");
	}
}
