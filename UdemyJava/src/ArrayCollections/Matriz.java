package ArrayCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos?");
		int qtAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas?");
		int qtNotas = entrada.nextInt();
		
		double notaTurma[][] = new double[qtAlunos][qtNotas];
		
		double total = 0;
		for (int a = 0; a < notaTurma.length; a++) {
			for (int n = 0; n < notaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1 ,a+1);
				
				notaTurma[a][n] = entrada.nextDouble();
				total += notaTurma[a][n];
;			}
		}
		
		double media = total / (qtAlunos * qtNotas);
		System.out.println("Média da turma é: "+ media);
		
		for(double[] notasAlunos: notaTurma) {			
			System.out.println(Arrays.toString(notasAlunos));
		}
		
		entrada.close();
	}
}
