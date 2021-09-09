package ep2_NightClass;

import javax.swing.JOptionPane;

public class Pop_up {
	public static void main(String[] args) {
		int i = JOptionPane.showConfirmDialog(null, "Olá, primeira vez aqui?","Mensagem de nome", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.print(i);
	}
}
