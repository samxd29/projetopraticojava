//Ela � um contrato onde quem assina se responsabiliza por implementar esses m�todos (cumprir o contrato);
// N�o pode ter m�todos concretos, somente abstratos;
// todos os m�todos na interface s�o sempre abstratos e sempre p�blicos
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
		
}
