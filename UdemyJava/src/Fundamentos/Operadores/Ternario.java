package Fundamentos.Operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.8;
		String re = media<=5.9 ? "Reprovado": "Recupera��o";
		String r = media>=7 ? "Aprovado": "Recupera��o";
		
		System.out.println(r);
		System.out.println(re);
	}
}
