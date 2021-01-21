package Controle;

import javax.swing.JOptionPane;

public class ElseIf {
	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Digite a nota:");
		double media = Double.parseDouble(nota);
		
		if(media>10 || media<0) {
			System.out.println("Nota inválida");
		} else {
			if(media>=8.1) {
				System.out.println("Conceito A");
			} else if(media>=6.1) {
				System.out.println("Conceito B");
			} else if(media>=4.1) {
				System.out.println("Conceito C");
			} else if(media>=2.1) {
				System.out.println("Conceito D");
			} else if(media>=0) {
				System.out.println("Conceito E");
			}
			System.out.println("Nota válida");
		}
	}
}
