package Fundamentos.Operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int g = 2;
		
		a++;
		a--;
		
		++g;
		--g;
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(a++ == g--);
		System.out.println(a);
		System.out.println(g);
	}
}
