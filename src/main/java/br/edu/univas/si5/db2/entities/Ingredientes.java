package br.edu.univas.si5.db2.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ingredientes implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer autoID;
	private String massa;
	private String recheio;
	
	
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@ManyToOne
	@JoinColumn(name="id_pizza")
	private Pizza pizza;
	
	public Ingredientes () {}

	public Integer getAutoID() {
		return autoID;
	}

	public void setAutoID(Integer autoID) {
		this.autoID = autoID;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public Pizza getId_pizza() {
		return pizza;
	}

	public void setId_pizza(Pizza pizza) {
		this.pizza = pizza;
	}

}

	
