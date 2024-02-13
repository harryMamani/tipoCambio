package com.ibk.tipoCambio.advisor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibk.tipoCambio.exception.MonedaException;
import com.ibk.tipoCambio.exception.TipoCambioException;


@RestControllerAdvice
public class ControllerAdvisor {
	
	private static final Logger log = LogManager.getLogger(ControllerAdvisor.class);

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> handlerException(Exception ex) {
		log.error(ex.getMessage(), ex);
		return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
	
	@ExceptionHandler({ MonedaException.class, TipoCambioException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> businessException(Exception ex) {
		log.error(ex.getMessage(), ex);
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}
	
}
