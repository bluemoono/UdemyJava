package OrientadoObjeto.Herança.Desafio;

public class Carro{
	public final double VELOCIDADE_MAXIMA;
	protected double velocidadeAtual;
	private double delta = 5;
	
	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public Carro(double velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > 0) {			
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual+= getDelta();			
		}
	}
	
	public void frear() {
		if(velocidadeAtual>=5) {			
			velocidadeAtual-=5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual: " + velocidadeAtual;
	}
}
