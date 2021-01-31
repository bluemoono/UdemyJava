package OrientadoObjeto.Herança.Teste;

import OrientadoObjeto.Herança.Desafio.BMW;
import OrientadoObjeto.Herança.Desafio.Carro;
import OrientadoObjeto.Herança.Desafio.Pegeut;

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
