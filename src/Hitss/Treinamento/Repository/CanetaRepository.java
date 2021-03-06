package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.*;

public class CanetaRepository {
	public void status(Caneta caneta) {
		System.out.println("Modelo: " + caneta.modelo);
		System.out.println("Uma caneta " + caneta.cor);
		System.out.println("Ponta: " + caneta.getPonta());
		System.out.println("Carga: " + caneta.getCarga());
		String resp = caneta.isTampada()? "Sim" : "N�o";
		System.out.println("Esta tampada? " + resp);
	}
	
	public void rabiscar(Caneta caneta) {
		if (caneta.isTampada()) {
			System.out.println("ERRO! N�o posso rabiscar.");
		}
		else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar(Caneta caneta) {
		caneta.setTampada(true);;
	}
	
	public void destampar(Caneta caneta) {
		caneta.setTampada(false);;
	}
}
