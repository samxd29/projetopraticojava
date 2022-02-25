
public abstract class Funcionario {
	//Uma classe abstrata representa um conceito, algo abstrato, e o compilador n�o permite instanciar um objeto dessa classe. 
	//Para instanciar � preciso criar primeiro uma classe filha n�o abstrata.
	private String nome;
	private String cpf;
	private double salario;
	// protected � publico para os filhos 
	
	//construtor sempre vai ter o nome da classe 
	public Funcionario() {
		
	}
	
	// Abstract no m�todo significa que ele n�o tem corpo; Os filhos s�o obrigados a implementar o m�todo getBonifica��o;
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
