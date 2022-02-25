
public abstract class Funcionario {
	//Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa classe. 
	//Para instanciar é preciso criar primeiro uma classe filha não abstrata.
	private String nome;
	private String cpf;
	private double salario;
	// protected é publico para os filhos 
	
	//construtor sempre vai ter o nome da classe 
	public Funcionario() {
		
	}
	
	// Abstract no método significa que ele não tem corpo; Os filhos são obrigados a implementar o método getBonificação;
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
