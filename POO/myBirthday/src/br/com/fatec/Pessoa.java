package br.com.fatec;
public abstract class Pessoa implements Informacao{
	public String nome;
	public Telefone telefone;
	public Pessoa(String nome, Telefone telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
}