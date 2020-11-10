package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Repository.*;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		CanetaRepository cr1 =  new CanetaRepository();
		cr1.status(c1);
	}
}
