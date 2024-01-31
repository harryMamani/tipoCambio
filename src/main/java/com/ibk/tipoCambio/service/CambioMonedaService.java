package com.ibk.tipoCambio.service;

import com.ibk.tipoCambio.dto.CambioMonedaRequest;
import com.ibk.tipoCambio.dto.CambioMonedaResponse;
import com.ibk.tipoCambio.exception.TipoCambioException;

public interface CambioMonedaService {

	 CambioMonedaResponse registrarCambio(CambioMonedaRequest request) throws TipoCambioException;
	 
}
