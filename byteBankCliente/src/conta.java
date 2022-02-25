
public class conta {
	// o atributo não pode ser nem lido nem modificado, a não ser pela própria class
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//metodo : uma maneira de fazer as coisas
	// void: não retorna nada;
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
