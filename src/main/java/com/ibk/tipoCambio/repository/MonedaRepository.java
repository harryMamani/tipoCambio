package com.ibk.tipoCambio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibk.tipoCambio.entity.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Integer> {

	Optional<Moneda> findByDivisa(String divisa);

}
