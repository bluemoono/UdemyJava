package OrientadoObjeto.Abstrato;

public class Cachorro extends Mamifero{
	@Override
	public String mover() {
		return "Usa as patas";
	}
	
	@Override
	public String mamar() {
		return "Recebe leite de sua mãe";
	}
}
