package com.ibk.tipoCambio.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCambioException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8022659113383971497L;

	
	private String mensaje;

	private Integer codigo;

	private Throwable cause;

	
	public TipoCambioException() {
		super();
	}
	
	public TipoCambioException(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}

	public TipoCambioException(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public TipoCambioException(Throwable cause) {
		super(cause);
		this.setCause(cause);
	}

	public TipoCambioException(String mensaje, Integer codigo) {
		super(mensaje);
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public TipoCambioException(Integer codigo, Throwable cause) {
		super(cause);
		this.codigo = codigo;
		this.setCause(cause);
	}

	public TipoCambioException(String mensaje, Throwable cause) {
		super(mensaje, cause);
		this.mensaje = mensaje;
		this.setCause(cause);
	}

	public TipoCambioException(String mensaje, Integer codigo, Throwable cause) {
		super(mensaje, cause);
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.setCause(cause);
	}
	
}
