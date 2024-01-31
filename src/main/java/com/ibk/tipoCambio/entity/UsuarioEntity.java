package com.ibk.tipoCambio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

	@JsonIgnore
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@Column(name = "username")
	private String username;
	@JsonIgnore
	@Column(name = "password")
	private String password;
	@JsonIgnore
	@Column(name = "nombres")
	private String nombres;
	@JsonIgnore
	@Column(name = "apellidos")
	private String apellidos;
	@JsonIgnore
	@Column(name = "estado")
	private String estado;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private RolEntity rol;
	
	
}
