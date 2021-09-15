package novo;

public class Pessoa implements Comparable<Pessoa>{
	public String nome;
	public String idade;
	public String peso;
	public Pessoa(String nome, String idade, String peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	@Override
	public String toString() {
		String info = "Nome: "+ this.nome +"Idade: "+ this.idade + "Peso: " + this.peso;
		return info;
	}
	@Override
	public boolean equals(Object obj) {
		Pessoa p = (Pessoa) obj;
		return this.nome.equals(p.nome);
	}
	@Override
	public int compareTo(Pessoa arg0) {
		return 0;
	}
}