package Fundamentos;

import java.util.Scanner;

public class EqualsString {
	public static void main(String[] args) {
		System.out.println("2"=="2");
		String s = new String("2");
		
		System.out.println("2"==s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2"== s2.trim()); //tira os espa�os
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
