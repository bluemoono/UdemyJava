package ClasseObjeto;

import ClasseObjeto.Desafio.Data;

public class ValorXReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;//atribuição por valor(primitivo)
		a++;
		b--;
		
		System.out.println(a + " "+ b);
		
		Data d1 = new Data(12, 9, 2020);
		Data d2 = d1;
		
		System.out.println(d1.impressao());
		System.out.println(d2.impressao());
		
		int b1 = 5;
		alterarPrimitivo(b1);
		System.out.println(b1);
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
