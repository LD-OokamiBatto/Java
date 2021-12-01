package exercicio2;

import java.util.LinkedList;
import java.util.List;

public class AgenciaBancaria {
	private List<Pessoa> pessoa = new LinkedList<Pessoa>();
	private List<Conta> conta = new LinkedList<Conta>();

	public void addPessoa(Pessoa pes) {
		pessoa.add(pes);
	}
	public List<Pessoa> getPessoas() {
		return pessoa;
	}		
	public void addConta(Conta con) {
		conta.add(con);
	}	
	public List<Conta> buscarContaPorChave(String chave) {
		for(Conta con:conta) {
			if(con.getConta().equals(chave)) return conta;
		}
		return null;
	}
}
