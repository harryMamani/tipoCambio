package com.ibk.tipoCambio.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CambioMonedaRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3684901265685916896L;

	private String monedaOrigen;
	
	private String monedaDestino;
	
	private Double monto;	
	
	
}
