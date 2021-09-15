package br.com.fatec;
public class Professor extends Pessoa implements Outra{
	public int quantidadeAulas;
	public Professor(String nome, Telefone telefone,int quantidadeAulas) {
		super(nome, telefone);
		this.quantidadeAulas = quantidadeAulas;
	}
	@Override
	public void info() {
		System.out.println("Quantidade de aulas: " + quantidadeAulas);
	}
}
//public void exclusivoProfessor() {
	//	System.out.println("Algo que somente o professor faz/sabe faze: ");
	//	System.out.println("ajudar os alunos, mas pode reprovar");
	//}