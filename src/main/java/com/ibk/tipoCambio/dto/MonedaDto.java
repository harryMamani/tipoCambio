package com.ibk.tipoCambio.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MonedaDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4732064038960903986L;

	private Integer id;

	private String divisa;

	private String nombre;

	private Double tipoCambio;

}
