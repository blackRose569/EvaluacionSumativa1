package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ventas")
public class Ventas {
	
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	@Size(min = 3, max = 15)
	private String nombreVendedor;
	@Size(min = 4)
	private float totalVenta;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public float getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	public Ventas() {
		super();
	}
	
	public Ventas(Long id, String nombreVendedor, float totalVenta) {
		super();
		this.id = id;
		this.nombreVendedor = nombreVendedor;
		this.totalVenta = totalVenta;
	}
	
	
	
	
}
