package Fundamentos;

import java.util.Scanner;

public class Warppers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;//Integer.parseInt(entrada.nextLine());
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l/4);
		
		Float f = 123.1F;
		System.out.println(f);
		
		Double d = 123.424;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '$';
		System.out.println(c);
		
		entrada.close();
	}
}
