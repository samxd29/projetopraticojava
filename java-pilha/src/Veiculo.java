
public abstract class Veiculo implements Motor {
	public abstract void movimentar();
	
	public abstract String getIdentificacao();
	
	public void showConfig() {
		System.out.println("M�todo para mostrar configura��es");
	}
}
