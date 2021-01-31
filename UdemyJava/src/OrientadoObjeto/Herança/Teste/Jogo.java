package OrientadoObjeto.Herança.Teste;

import OrientadoObjeto.Herança.Direcao;
import OrientadoObjeto.Herança.Heroi;
import OrientadoObjeto.Herança.Jogador;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador(0,0);
		j1.x = 10;
		j1.y = 10;
		
		Jogador heroi = new Heroi();
		heroi.x = 11;
		heroi.y = 11;
		
		j1.moveu(Direcao.NORTE);
		j1.moveu(Direcao.NORTE);
		j1.moveu(Direcao.LESTE);
		j1.moveu(Direcao.SUL);
		j1.moveu(Direcao.OESTE);
		
		j1.atacar(heroi);
		heroi.atacar(j1);
		
		System.out.println(j1.x);
		System.out.println(j1.y);
	}
}
