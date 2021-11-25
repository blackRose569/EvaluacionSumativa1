package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	@Size(min = 3, max = 20)
	private String nombreProducto;
	@Size(min = 2, max = 15)
	private String categoria;
	@Size(min = 4)
	private float precio;
	
	
	
	
	
	public Productos(Long id, String nombreProducto, String categoria, float precio) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.categoria = categoria;
		this.precio = precio;
	}
	public Productos() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	} 
	
	

	
	


}
