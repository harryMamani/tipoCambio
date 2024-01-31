package com.ibk.tipoCambio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rol")
public class RolEntity {
	
	@Id
	@Column(name = "id_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_rol")
	private String nombre;
	@Column(name = "descripcion_rol")
	private String descripcion;

}
