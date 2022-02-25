
public class conta {
	// o atributo n�o pode ser nem lido nem modificado, a n�o ser pela pr�pria class
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//metodo : uma maneira de fazer as coisas
	// void: n�o retorna nada;
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
