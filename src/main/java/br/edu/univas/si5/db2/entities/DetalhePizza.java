package br.edu.univas.si5.db2.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DetalhePizza implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_detalhes;
	private char tamanhoPizza;
	private Integer qtd_pizza;
	private float preco;
	
	public DetalhePizza() {

	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date data_pedido;
	
	//@OneToOne(mappedBy = "id_dtl")
	private Pizza Pizza;

	public Integer getId_sabores() {
		return id_detalhes;
	}

	public void setId_sabores(Integer id_detalhes) {
		this.id_detalhes = id_detalhes;
	}

	
	public char getTamanhoPizzaFk() {
		return tamanhoPizza;
	}

	public void setTamanhoPizzaFk(char tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}

	public Integer getQtd_pizza() {
		return qtd_pizza;
	}

	public void setQtd_pizza(Integer qtd_pizza) {
		this.qtd_pizza = qtd_pizza;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public Pizza getPizza() {
		return Pizza;
	}

	public void setPizza(Pizza pizza) {
		Pizza = pizza;
	}


	
}
