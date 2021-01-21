package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua media:");
		String nota = entrada.next();
		
		double media = Double.parseDouble(nota);
		
		if(media>=7) {
			System.out.println("Aprovado");
		} else if(media>4.9 && media <= 6.9) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Recuperação");
		}
		
		entrada.close();
	}
}
