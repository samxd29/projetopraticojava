
public class conta {
	// o atributo n�o pode ser nem lido nem modificado, a n�o ser pela pr�pria class
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// o static quer dizer que o total n�o � mais um objeto somente da conta, mas da class;
	// O java cria um construtor padr�o, com numero defoult, mas quando vc quer imprimir uns dados de acesso vc passa parametro para o construtor padr�o;
	// construtores s�o utilizados para inicializa��o de atributos;
	public conta(int agencia, int numero) {
		conta.total++;
		System.out.println("O total de contas � " + conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
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
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return conta.total;
	}
}
