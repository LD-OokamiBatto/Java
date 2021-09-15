package affz;

public class Inicio {
	public static void main(String[]args) {
		Pessoa p = new Pessoa(null, null, 0);
		p.nome = "Gabriel";
		Pessoa p2 = new Pessoa(null, null, 1);
		p2.nome = "Arthur";
		Telefone tel= new Telefone();
		tel.ddd = 12; tel.numero = 988174389;
		p.telefone = tel;
		p2.telefone =  p.telefone;
		tel.ddd = 19; tel.numero= 129812553;
		System.out.println("Imprimir: " + p.nome);
		System.out.println("Telefone: " + p2.telefone.numero);
		System.out.println("Idade: " + p2.idade);
		Manipulador ma= new Manipulador();
		ma.alterarNome(p, "Steve Rogers");
		p.idade = 42;
		p2.idade= p.idade;
		p.idade= p.idade + 30;
		//int x = 10;
		//int y = x;
		//y = y +10;
		//System.out.println(x);
		//System.out.println(y);
	}
}