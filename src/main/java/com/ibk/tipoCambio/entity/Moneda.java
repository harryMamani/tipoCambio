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
@Table(name = "moneda")
public class Moneda {

	@Id
	@Column(name = "id_moneda")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_divisa")
	private String divisa;

	@Column(name = "nombre_moneda")
	private String nombre;

	@Column(name = "tipo_cambio")
	private Double tipoCambio;	

}