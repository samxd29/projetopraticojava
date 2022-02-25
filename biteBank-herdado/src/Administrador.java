
public class Administrador extends Funcionario implements Autenticavel {
	
	private UtilizadorAutenticavel Autenticador;

	public Administrador() {
		this.Autenticador = new UtilizadorAutenticavel();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.Autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.Autenticador.autentica(senha);
	}

}
