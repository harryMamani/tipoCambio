package com.ibk.tipoCambio.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibk.tipoCambio.dto.MonedaDto;
import com.ibk.tipoCambio.entity.Moneda;
import com.ibk.tipoCambio.exception.MonedaException;
import com.ibk.tipoCambio.repository.MonedaRepository;
import com.ibk.tipoCambio.service.MonedaService;

@Service
public class MonedaServiceImpl implements MonedaService {

	@Autowired
	MonedaRepository monedaRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<MonedaDto> listar() {
		return monedaRepository.findAll().stream().map(m -> modelMapper.map(m, MonedaDto.class)).toList();
	}

	@Override
	public MonedaDto crear(MonedaDto moneda) {
		var optionalDivisa = monedaRepository.findByDivisa(moneda.getDivisa());
		optionalDivisa.ifPresent(m -> {
			throw new MonedaException("Ya existe una moneda con divisa: " + m.getDivisa());
		});
		var entity = modelMapper.map(moneda, Moneda.class);
		var save = monedaRepository.save(entity);
		var dto = modelMapper.map(save, MonedaDto.class);
		return dto;
	}

	@Override
	public MonedaDto actualizar(Integer id, MonedaDto moneda) {
		var entity = monedaRepository.findById(id)
				.orElseThrow(() -> new MonedaException("no se encuentra una moneda con id: " + id));
		var optionalDivisa = monedaRepository.findByDivisa(moneda.getDivisa());
		if (optionalDivisa.isPresent() && !moneda.getDivisa().equals(entity.getDivisa())) {
			new RuntimeException("Ya existe una moneda con divisa: " + optionalDivisa.get().getDivisa());
		}

		entity.setDivisa(moneda.getDivisa());
		entity.setNombre(moneda.getNombre());
		entity.setTipoCambio(moneda.getTipoCambio());

		var save = monedaRepository.save(entity);
		var dto = modelMapper.map(save, MonedaDto.class);
		return dto;
	}

	@Override
	public void eliminar(Integer id) {
		var entity = monedaRepository.findById(id)
				.orElseThrow(() -> new MonedaException("no se encuentra una moneda con id: " + id));
		monedaRepository.delete(entity);

	}

}
