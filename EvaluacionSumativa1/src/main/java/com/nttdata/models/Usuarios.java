package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	
	@Size(min = 3, max = 15)
	private String nombre;
	@Size(min = 3, max = 15)
	private String apellido;
	@Size(min = 6, max = 12)
	private int telefono;
	
	
	
	public Usuarios() {
		super();
	}
	
	
	
	
	public Usuarios(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}


	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
