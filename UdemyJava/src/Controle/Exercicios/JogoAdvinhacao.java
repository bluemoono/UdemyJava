package Controle.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
	public static void main(String[] args) {
		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;
		
		System.out.println(randomInt);
		
		Scanner entrada = new Scanner(System.in);

			for (int i = 0; i < 10; i ++ ) {
				int j=10;
				
				System.out.println("Digite sua aposta");
				int aposta = entrada.nextInt();
				
				if(aposta == randomInt) {
					System.out.println("Parabens acertou");
					break;
				} else {
					System.out.println("\nTente novamente");
					System.out.println("Suas chances são: "+ (j-i));
				}
				
			}
			
			
		entrada.close();
		
		
		
		
	}
}
