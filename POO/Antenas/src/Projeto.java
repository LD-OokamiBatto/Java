import java.util.concurrent.ConcurrentLinkedQueue;

public class Projeto {
	private ConcurrentLinkedQueue<Entrega> Projeto = new ConcurrentLinkedQueue<Entrega>();
	private String chave;
	public Projeto(String chave) {
		this.chave = chave;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public ConcurrentLinkedQueue<Entrega> getProjeto() {
		return Projeto;
	}
	public void setProjeto(ConcurrentLinkedQueue<Entrega> projeto) {
		Projeto = projeto;
	}
}
