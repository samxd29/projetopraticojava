import java.util.ArrayList;
import java.util.Iterator;

public class TesteVeiculo {

	public static void main(String[] args) {
		Aviao a = new Aviao();
		Moto m = new Moto();
		
		Veiculo v = m;
		v = a;
		ArrayList<Veiculo> lista = new ArrayList<>();
		lista.add(a);
		lista.add(m);
		System.out.println(lista.size());
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Veiculo veiculo = (Veiculo) iterator.next();
			System.out.println(veiculo.getIdentificacao());
		}
		Motor motor = a;
		
	}

}
