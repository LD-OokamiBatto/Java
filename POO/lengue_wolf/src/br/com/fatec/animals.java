package br.com.fatec;
import javax.swing.JOptionPane;
public class animals {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Inserir nome");
		String meio =  JOptionPane.showInputDialog("Inserir g�nero");
		String fim =  JOptionPane.showInputDialog("Inserir origem");
		Popula��o pop = new Popula��o();
		pop.Paises[0] = "Canad�";
		pop.Paises[1] = "EUA";
		pop.Paises[2] = "Inglaterra";
		CanisLupus CN1 = new CanisLupus(entrada, meio, fim, pop);
		String texto =  "Nome: " + CN1.Nome + "\n" + "Genero: " + CN1.Genero + "\n" + "Origem: " + CN1.Origem + "\n";
		texto = texto + "Popula��o: \n";
		for(int i = 0; i < pop.Paises.length; i++) {
			texto = texto + "Pa�s: "+ pop.Paises[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}