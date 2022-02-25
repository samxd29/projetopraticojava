
public class TestaBanco {
	public static void main(String[] args) {
		Cliente samantha = new Cliente();
		samantha.nome = "Samantha";
		samantha.cpf = "119.486.176-84";
		samantha.profissao = "Historiadora";
		
		conta ContaSam = new conta();
		ContaSam.deposita(100);
		// associa a cliente Samantha a ContaSam;
		ContaSam.titular = samantha;
		System.out.println(ContaSam.titular.nome);
	}
}
