package com.ibk.tipoCambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibk.tipoCambio.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	UsuarioEntity findByUsername(String username);
}
