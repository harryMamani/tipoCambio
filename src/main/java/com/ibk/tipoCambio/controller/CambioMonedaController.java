package com.ibk.tipoCambio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibk.tipoCambio.dto.CambioMonedaRequest;
import com.ibk.tipoCambio.dto.CambioMonedaResponse;
import com.ibk.tipoCambio.exception.TipoCambioException;
import com.ibk.tipoCambio.service.CambioMonedaService;

@RequestMapping("/cambio")
@RestController
public class CambioMonedaController {

	@Autowired
	CambioMonedaService cambioMonedaService;
	
	@PostMapping("/")
	public CambioMonedaResponse registrar(@RequestBody CambioMonedaRequest request) throws TipoCambioException {
		return cambioMonedaService.registrarCambio(request);
	}
	
}
