package br.edu.univas.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.Pizza;

public class PizzaDao {
	
	
		
		EntityManager pzz = HibernateUtil.getEntityManager();
		
		public void persistir(Pizza pizza) {
			pzz.getTransaction().begin();
			pzz.persist(pizza);
			pzz.getTransaction().commit();		}	
		

		public Pizza consultar(Integer id) {
			Pizza id_pizza = pzz.find(Pizza.class, id);
			return id_pizza;
		}

		public void atualizar(Pizza pizza) {
			pzz.getTransaction().begin();
			pzz.merge(pizza);
			pzz.getTransaction().commit();
		}

		public void deletar(Integer id) {
			Pizza pizza = pzz.find(Pizza.class, id);
			pzz.getTransaction().begin();
			pzz.remove(pizza);
			pzz.getTransaction().commit();
			
		}







}
