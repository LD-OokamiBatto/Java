package novo;
import java.util.HashSet;
import java.util.Set;
public class Corona {
	public static void main(String[] args) {
		Set<Pessoa> pessoas = new HashSet<Pessoa>();
		Pessoa p = new Pessoa("Sherlock Holmes", "25 anos", "84 Kg");
		pessoas.add(p);
		Pessoa p1 = new Pessoa("John Walteson", "36 anos", "75 Kg");
		Pessoa p2 = new Pessoa("Lady Death", "20 anos", " Não se revela o peso de uma dama");
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p);
		System.out.println(p.compareTo(p1));
		if(p.equals(p1)) {
			System.out.println("São iguais!!");
		}
		for(Pessoa x: pessoas) {
				System.out.println(x.nome);
				}
	}
}
//int [] numero = new int[2];
//System.out.println(pessoas.size());
//String texto = "aaa";
//String texto1 = "aaa";
//Set<String> texto = new HashSet<String>();
		//texto.add("aaa");
		//texto.add("aaa");
		//for (String s: texto) {
		//	System.out.println(s);
		//}
//Para remover
//pessoas.remove(p);