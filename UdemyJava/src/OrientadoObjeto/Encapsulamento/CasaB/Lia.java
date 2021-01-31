package OrientadoObjeto.Encapsulamento.CasaB;

import OrientadoObjeto.Encapsulamento.CasaA.Ana;

public class Lia {
	Ana cunhada = new Ana();
	void testeAcesso() {
//		segredo - privado
//		fala - protected
//		dentroCasa - pacote
//		publico
		
//		System.out.println(cunhada.segredo);
//		System.out.println(cunhada.dentroCasa);
//		System.out.println(cunhada.fala); // acessa normalmente
		System.out.println(cunhada.publico);
	}

}
