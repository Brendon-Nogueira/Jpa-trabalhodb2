package br.edu.univas.si5.db2.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Pizza implements Serializable{
	
	
	@Id	
	@OneToMany(mappedBy="pizza", fetch = FetchType.LAZY)
	private Integer id_pizza;
	private String qtd_ingredientes;
		
	@OneToOne
	@JoinColumn(name="id_detalhes")
	private Integer id_dtl;
	
	
	public Pizza() {}
	

	public Integer getId_pizza() {
		return id_pizza;
	}

	public void setId_pizza(Integer id_pizza) {
		this.id_pizza = id_pizza;
	}

	public String getQtd_ingredientes() {
		return qtd_ingredientes;
	}

	public void setQtd_ingredientes(String qtd_ingredientes) {
		this.qtd_ingredientes = qtd_ingredientes;
	}

	public Integer getId_dtl() {
		return id_dtl;
	}

	public void setId_dtl(Integer id_dtl) {
		this.id_dtl = id_dtl;
	}


	
	
	
	
	
}
