package Controle.Desafios;

import javax.swing.JOptionPane;

public class Semana {
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Digite o dia (com os acentos)");
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("Sábado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido");
		}
	}
}
