package Fundamentos.Operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		int c = a + b;
		
		c+=b; //c = c + b
		c-=a; //c = c - a
		c*=b; //c = c * b
		c/=a; //c = c / a
		c%=b; //c = c % b;  0 ou 1 
		
		System.out.println(c);
	}
}
