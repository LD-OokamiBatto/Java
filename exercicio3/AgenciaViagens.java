package exercicio3;

import java.util.LinkedList;
import java.util.List;

public class AgenciaViagens {
	private List<Lugar> lugar = new LinkedList<Lugar>();
	private List<Pessoa> pessoa = new LinkedList<Pessoa>();

	public void addLugar(Lugar lug) {
		lugar.add(lug);
	}
	public List<Lugar> getLugar() {
		return lugar;
	}		
	public void addPessoa(Pessoa pes) {
		pessoa.add(pes);
	}	
	public List<Pessoa> getPessoa(){
		return pessoa;
	}
}
