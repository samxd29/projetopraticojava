
public abstract class Veiculo implements Motor {
	public abstract void movimentar();
	
	public abstract String getIdentificacao();
	
	public void showConfig() {
		System.out.println("Método para mostrar configurações");
	}
}
