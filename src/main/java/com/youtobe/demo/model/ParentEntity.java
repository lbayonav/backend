package com.youtobe.demo.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// Clase padre que va a heredar todas las entidades
@MappedSuperclass
// Aceso tipo de campo, las anotacion van sobre el campo y no la propiedad - osea el metodo
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	// estrategia de id automatico basado en la configuracion de la tabla
	@GeneratedValue(strategy=GenerationType.AUTO)
	// Campo como se llama en la base de datos, primary key, no permite nulos 
	@Column(name="id", unique=true, nullable=false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
