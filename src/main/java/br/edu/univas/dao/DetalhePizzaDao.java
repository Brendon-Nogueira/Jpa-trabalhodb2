package br.edu.univas.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.DetalhePizza;
import br.edu.univas.si5.db2.entities.Pizza;

public class DetalhePizzaDao {
	
	EntityManager dtlh = HibernateUtil.getEntityManager();
	
	public void persistir( DetalhePizza detalhepzz) {
		dtlh.getTransaction().begin();
		dtlh.persist(detalhepzz);
		dtlh.getTransaction().commit();		}	
	

	public DetalhePizza consultar(Integer id) {
		DetalhePizza id_detalhe = dtlh.find(DetalhePizza.class, id);
		return id_detalhe;
	}

	public void atualizar(DetalhePizza detalhepzz) {
		dtlh.getTransaction().begin();
		dtlh.merge(detalhepzz);
		dtlh.getTransaction().commit();
	}

	public void deletar(Integer id) {
		Pizza pizza = dtlh.find(Pizza.class, id);
		dtlh.getTransaction().begin();
		dtlh.remove(pizza);
		dtlh.getTransaction().commit();
		
	}
}
