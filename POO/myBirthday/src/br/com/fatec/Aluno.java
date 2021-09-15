package br.com.fatec; 

public class Aluno extends Pessoa implements Outra{
	public String ra;
	public Aluno(String nome, Telefone telefone, String ra) {
		super(nome, telefone);
		this.ra = ra;
	}
	@Override
	public void info() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: " + ra);
	}
}