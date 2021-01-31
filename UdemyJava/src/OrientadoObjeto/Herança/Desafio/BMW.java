package OrientadoObjeto.Herança.Desafio;

public class BMW extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public BMW(){
		this(300);
	}
	
	public BMW(double vlMaximo){
		super(vlMaximo);
		setDelta(15);
	}
	
	@Override
	public void acelerar() {
		velocidadeAtual+=15;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public double getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {			
			return 15;
		}
	}

}
