package br.edu.univas.si5.db2.run;

import br.edu.univas.dao.DetalhePizzaDao;
import br.edu.univas.si5.db2.entities.DetalhePizza;


public class StartApp2 {
	
	public static void main(String[] args) {
		
		
		DetalhePizza dtl = new DetalhePizza();
		dtl.setId_sabores(1);
		dtl.setPreco(22.50F);
		dtl.setQtd_pizza(3);
		dtl.setTamanhoPizzaFk('M');
		
		DetalhePizzaDao dpd = new DetalhePizzaDao();
		dpd.persistir(dtl);
	}
}
