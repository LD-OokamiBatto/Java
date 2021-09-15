package br.com.fatec;
public class Inicio {
	public static void main(String[] args) {
		Telefone tel = new Telefone("12 9815663258");
		Pessoa a = new Professor("Aranhaki", tel, 42);
		Pessoa b = new Aluno("Lalalala", tel, "00034697854-64");
		Pessoa c = new Aluno("Malumba", tel, "423468572-92");
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = a;
		pessoas[1] = b;
		pessoas[2] = c;
		for (Pessoa pessoa : pessoas) {
			pessoa.info();
			}
	}
}
//int x = 10;
		//double y = x;
//a.imprimirInformcoes();
//b.imprimirInformcoes();
//for(int i=0; i < ps.length; i++);{
		//	int i;
		//	ps[i];
		//}
//for (Pessoa p : ps) {
//	p.imprimirInformacoes();
//}