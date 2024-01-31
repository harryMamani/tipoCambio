package com.ibk.tipoCambio.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CambioMonedaResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5418533211024346840L;

	private String monedaOrigen;
	
	private String monedaDestino;
	
	private Double tipoCambio;
	
	private Double monto;
	
	private Double montoConTipoCambio;
	
}
