package com.ibk.tipoCambio.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibk.tipoCambio.dto.CambioMonedaRequest;
import com.ibk.tipoCambio.dto.CambioMonedaResponse;
import com.ibk.tipoCambio.entity.TipoCambio;
import com.ibk.tipoCambio.exception.TipoCambioException;
import com.ibk.tipoCambio.repository.MonedaRepository;
import com.ibk.tipoCambio.repository.TipoCambioRepository;
import com.ibk.tipoCambio.service.CambioMonedaService;

@Service
public class CambioMonedaServiceImpl implements CambioMonedaService {

	@Autowired
	TipoCambioRepository tipoCambioRepository;

	@Autowired
	MonedaRepository monedaRepository;

	@Override
	public CambioMonedaResponse registrarCambio(CambioMonedaRequest request) throws TipoCambioException {

		var origen = monedaRepository.findByDivisa(request.getMonedaOrigen())
				.orElseThrow(() -> new TipoCambioException("no se encuentra moneda: " + request.getMonedaOrigen()));

		var destino = monedaRepository.findByDivisa(request.getMonedaDestino())
				.orElseThrow(() -> new TipoCambioException("no se encuentra moneda: " + request.getMonedaDestino()));

		double cambioOrigen = origen.getTipoCambio() * request.getMonto();

		double cambioDestino = cambioOrigen / destino.getTipoCambio();

		double conversion = cambioDestino / request.getMonto();

		TipoCambio registroTipoCambio = new TipoCambio();

		registroTipoCambio.setMonedaOrigen(origen);
		registroTipoCambio.setMonedaDestino(destino);
		registroTipoCambio.setMonto(request.getMonto());
		registroTipoCambio.setFecha(LocalDateTime.now());


		tipoCambioRepository.save(registroTipoCambio);

		CambioMonedaResponse response = new CambioMonedaResponse();

		response.setMonedaOrigen(origen.getNombre());
		response.setMonedaDestino(destino.getNombre());
		response.setMonto(request.getMonto());
		response.setTipoCambio(conversion);
		response.setMontoConTipoCambio(cambioDestino);

		return response;

	}

}
