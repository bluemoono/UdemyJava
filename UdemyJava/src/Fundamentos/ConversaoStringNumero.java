package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite o valor do primeiro número:");
		String v2 = JOptionPane.showInputDialog("Digite o valor do segundo número:");
		
		System.out.println(v1 + v2);
		
		double n1 = Double.parseDouble(v1);
		double n2 = Double.parseDouble(v2);
		
		double soma = n1 + n2;
		String r = Double.toString(soma);
		JOptionPane.showMessageDialog(null, r);
	}
}
