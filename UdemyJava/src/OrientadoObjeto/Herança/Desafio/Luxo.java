package OrientadoObjeto.Heran�a.Desafio;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	
	default int nivelAr() {
		return 1;
	}
}
