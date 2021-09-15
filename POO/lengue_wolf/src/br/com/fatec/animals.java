package br.com.fatec;
import javax.swing.JOptionPane;
public class animals {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Inserir nome");
		String meio =  JOptionPane.showInputDialog("Inserir gênero");
		String fim =  JOptionPane.showInputDialog("Inserir origem");
		População pop = new População();
		pop.Paises[0] = "Canadá";
		pop.Paises[1] = "EUA";
		pop.Paises[2] = "Inglaterra";
		CanisLupus CN1 = new CanisLupus(entrada, meio, fim, pop);
		String texto =  "Nome: " + CN1.Nome + "\n" + "Genero: " + CN1.Genero + "\n" + "Origem: " + CN1.Origem + "\n";
		texto = texto + "População: \n";
		for(int i = 0; i < pop.Paises.length; i++) {
			texto = texto + "País: "+ pop.Paises[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}