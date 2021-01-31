package OrientadoObjeto.Encapsulamento.CasaB;

import OrientadoObjeto.Encapsulamento.CasaA.Ana;

public class Joao extends Ana{
	Ana irma = new Ana();
	void testeAcesso() {
//		segredo - privado
//		fala - protected
//		dentroCasa - pacote
//		publico
		
//		System.out.println(irma.segredo);
//		System.out.println(irma.dentroCasa);
		System.out.println(fala); // acessa normalmente
		System.out.println(irma.publico);
	}

}
