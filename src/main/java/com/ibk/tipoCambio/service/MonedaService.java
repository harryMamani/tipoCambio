package com.ibk.tipoCambio.service;

import java.util.List;

import com.ibk.tipoCambio.dto.MonedaDto;



public interface MonedaService {
	
	List<MonedaDto> listar();
	
	MonedaDto crear(MonedaDto moneda);
	
	MonedaDto actualizar(Integer id, MonedaDto moneda);
	
	void eliminar(Integer id);
	
}
