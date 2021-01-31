package OrientadoObjeto.Herança;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;
	
	public Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 0 ) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0 ) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean moveu(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y++;
		} else if(direcao == Direcao.SUL) {
			y--;
		} else if(direcao == Direcao.LESTE) {
			x++;
		} else if(direcao == Direcao.OESTE) {
			x--;
		} else {
			System.out.println("Direção não válida");
		}
		
		return true;
	}
}
