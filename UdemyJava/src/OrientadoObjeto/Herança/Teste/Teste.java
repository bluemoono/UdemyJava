package OrientadoObjeto.Heran�a.Teste;

import OrientadoObjeto.Heran�a.Desafio.BMW;
import OrientadoObjeto.Heran�a.Desafio.Carro;
import OrientadoObjeto.Heran�a.Desafio.Pegeut;

public class Teste {
	public static void main(String[] args) {
		Carro c = new Pegeut();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.frear();
		System.out.println(c.toString());
		
		Carro b = new BMW();
		b.acelerar();
		b.acelerar();
		b.acelerar();
		b.frear();
		System.out.println(b.toString());
		
	}
}
