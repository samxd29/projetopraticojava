//Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato);
// Não pode ter métodos concretos, somente abstratos;
// todos os métodos na interface são sempre abstratos e sempre públicos
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
		
}
