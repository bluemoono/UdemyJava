package Controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe os n�meros:");
		int n = Integer.parseInt(valor);
		
		if(n%2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero impar");
		}
	}
}
