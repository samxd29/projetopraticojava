
public class Cliente implements Autenticavel {
	
	
	private UtilizadorAutenticavel Autenticador;
	
	public Cliente() {
		this.Autenticador = new UtilizadorAutenticavel();
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
