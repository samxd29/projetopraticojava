// Gerente herda classe do FuncionarioAutenticavel, assina contrato autenticavel;
public class Gerente extends Funcionario implements Autenticavel {
	
	private UtilizadorAutenticavel Autenticador;
	
		public Gerente() {
			this.Autenticador = new UtilizadorAutenticavel();
		}
	
	// reescrita do m�todo
		public double getBonificacao() {
			System.out.println("Chamando o m�todo bonificacao gerente");
			return super.getSalario();
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
