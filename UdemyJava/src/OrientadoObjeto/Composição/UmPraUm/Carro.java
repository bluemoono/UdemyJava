package OrientadoObjeto.Composição.UmPraUm;

public class Carro {
	Motor motor = new Motor(this);
	
	Carro(Motor motor){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.5) {			
			motor.fatorInjecao+=0.3;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {			
			motor.fatorInjecao-=0.3;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}