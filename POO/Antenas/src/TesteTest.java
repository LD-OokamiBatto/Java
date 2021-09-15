import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
class TesteTest {
	@Test
	public void test() {
		Antenas antenas = new Antenas();
		antenas.addEmpresario(new Empresario("blabla@", "teste", "blaca")); 
		antenas.addEmpresario(new Empresario("cat@", "blacaew", "gdeuihe")); 
		assertEquals(antenas.getEmpresarios().size(), 2);
		antenas.addProjeto(new Projeto("abc"));
		Projeto projeto = antenas.buscarProjetoPorChave("abc");
		assertEquals(projeto.getChave(), "abc");
		antenas.addAluno(new Aluno("Rafael", "lala@instituicao", "georginfoguete", "4588111563","analise de leigos"));
		antenas.addAluno(new Aluno("Carlos", "falso@instituicao", "umdiaeuterminarei", "16616161616161","manufatura manufaturada"));
		antenas.removeAluno(new Aluno("Rafael", "lala@instituicao", "georginfoguete", "4588111563","analise de leigos"));
		assertEquals(antenas.getAlunos().size(), 1);
		antenas.addProfessor(new Professor("Legal","conformeabnt@instuicaolegal.com","15115115151","cr14nd0m3nt3sbr1lh4n73s"));
		assertEquals(antenas.getProfessor().size(), 1);
		antenas.addCads(new Cads("Carlos","tosemsinaldatim@eclipse.com","bençaVovô1307"));
		assertEquals(antenas.getCads().size(),1);	
	}
}