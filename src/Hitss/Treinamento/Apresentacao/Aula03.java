package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Repository.*;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		CanetaRepository cr1 =  new CanetaRepository();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		//c1.setPonta(0.5f); 
		c1.setCarga(80);
		//c1.setTampada(false);
		cr1.tampar(c1);
		cr1.status(c1);
		cr1.rabiscar(c1);
	}
}
