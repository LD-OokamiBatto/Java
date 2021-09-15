import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private ConcurrentLinkedQueue<Aluno> alunos = new ConcurrentLinkedQueue<Aluno>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<Cads> membrosCads = new LinkedList<Cads>();

	public void addEmpresario(Empresario emp) {
		empresarios.add(emp);
	}
	public List<Empresario> getEmpresarios() {
		return empresarios;
	}		
	public void addProjeto(Projeto proj) {
		projetos.add(proj);
	}	
	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public ConcurrentLinkedQueue<Aluno> getAlunos(){
		return alunos;
	}
	
	public void addProfessor(Professor prof) {
		professores.add(prof);
	}
	
	public List<Professor> getProfessor(){
		return professores;
	}
	
	public void addCads(Cads cads) {
		membrosCads.add(cads);
	}
	public List<Cads> getCads(){
		return membrosCads;
	}
}