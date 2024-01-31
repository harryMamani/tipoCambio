package com.ibk.tipoCambio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibk.tipoCambio.dto.MonedaDto;
import com.ibk.tipoCambio.service.MonedaService;

@RequestMapping("/monedas")
@RestController
public class MonedaController {

	
	@Autowired
	MonedaService monedaService;
	
	@GetMapping("/")
	ResponseEntity<List<MonedaDto>> listar(){
		return ResponseEntity.ok(monedaService.listar());
	}
	
	@PostMapping("/")
	ResponseEntity<MonedaDto> crear(@RequestBody MonedaDto moneda) {
		return ResponseEntity.ok(monedaService.crear(moneda));
	}
	
	@PutMapping("/{id}")
	ResponseEntity<MonedaDto> actualizar(@PathVariable Integer id, @RequestBody MonedaDto moneda) {
		return ResponseEntity.ok(monedaService.actualizar(id, moneda));
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		monedaService.eliminar(id);
		return ResponseEntity.ok().build();
	}
	
}
