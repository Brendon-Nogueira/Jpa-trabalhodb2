package br.edu.univas.si5.db2.run;

import br.edu.univas.dao.IngredientesDao;
import br.edu.univas.si5.db2.entities.Ingredientes;

public class StartApp3 {
	
	public static void main(String[] args) {
		
		Ingredientes ingr = new Ingredientes();
		ingr.setAutoID(1);
		ingr.setMassa("Farinha de Trigo e Ovos");
		ingr.setRecheio("Molho de Tomate e Presunto e Queijo");
		
		IngredientesDao ingrdao = new IngredientesDao();
		ingrdao.persistir(ingr);
	}

}
