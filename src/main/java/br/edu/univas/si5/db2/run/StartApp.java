package br.edu.univas.si5.db2.run;

import br.edu.univas.dao.PizzaDao;
import br.edu.univas.si5.db2.entities.Pizza;

public class StartApp {
	
	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		pizza.setId_pizza(1);
		pizza.setId_dtl(3);
		pizza.setQtd_ingredientes("5");
		
		PizzaDao dao = new PizzaDao();
		dao.persistir(pizza);
		
		
		
	}
	
}
