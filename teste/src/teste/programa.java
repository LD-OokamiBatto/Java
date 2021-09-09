package teste;

import javax.swing.JOptionPane;

public class programa {
	public static void main(String[] args) {
		int i = JOptionPane.showConfirmDialog(null, "Primeira vez aqui?", "Mensagem de pergunta", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.print(i);
	}

}
