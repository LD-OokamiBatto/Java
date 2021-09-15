
public class Aluno {
	private String nome;
	private String email;
	private String senha;
	private String ra;
	private String curso;

public Aluno(String nome, String email, String senha, String ra, String curso) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ra = ra;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}