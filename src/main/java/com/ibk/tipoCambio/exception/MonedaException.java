package com.ibk.tipoCambio.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonedaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2366294996425028276L;
	
	private String mensaje;

	private Integer codigo;

	private Throwable cause;

	
	public MonedaException() {
		super();
	}
	
	public MonedaException(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}

	public MonedaException(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public MonedaException(Throwable cause) {
		super(cause);
		this.setCause(cause);
	}

	public MonedaException(String mensaje, Integer codigo) {
		super(mensaje);
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public MonedaException(Integer codigo, Throwable cause) {
		super(cause);
		this.codigo = codigo;
		this.setCause(cause);
	}

	public MonedaException(String mensaje, Throwable cause) {
		super(mensaje, cause);
		this.mensaje = mensaje;
		this.setCause(cause);
	}

	public MonedaException(String mensaje, Integer codigo, Throwable cause) {
		super(mensaje, cause);
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.setCause(cause);
	}

	
}
