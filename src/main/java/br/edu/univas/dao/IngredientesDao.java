package br.edu.univas.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.DetalhePizza;
import br.edu.univas.si5.db2.entities.Ingredientes;
import br.edu.univas.si5.db2.entities.Pizza;

public class IngredientesDao {
	
	
EntityManager ingr = HibernateUtil.getEntityManager();
	
	public void persistir( Ingredientes ingredientes) {
		ingr.getTransaction().begin();
		ingr.persist(ingredientes);
		ingr.getTransaction().commit();		}	
	

	public Ingredientes consultar(Integer id) {
		Ingredientes autoId = ingr.find(Ingredientes.class, id);
		return autoId;
	}

	public void atualizar(Ingredientes ingredientes) {
		ingr.getTransaction().begin();
		ingr.merge(ingredientes);
		ingr.getTransaction().commit();
	}

	public void deletar(Integer id) {
		Ingredientes ingredientes = ingr.find(Ingredientes.class, id);
		ingr.getTransaction().begin();
		ingr.remove(ingredientes);
		ingr.getTransaction().commit();
		
	}
}
