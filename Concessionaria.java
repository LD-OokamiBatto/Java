package exercicio1;

import java.util.LinkedList;
import java.util.List;

public class Concessionaria {
	private List<Carro> carro = new LinkedList<Carro>();

	public void addCarro(Carro car) {
		Carro.add(car);
	}
	public List<Carro> getCarro() {
		return carro;
	}		
}
