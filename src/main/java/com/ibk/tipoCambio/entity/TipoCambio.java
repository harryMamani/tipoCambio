package com.ibk.tipoCambio.entity;

import java.time.LocalDateTime;

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
@Table(name = "tipo_cambio")
public class TipoCambio {

	@Id
	@Column(name = "id_tipo_cambio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoCambio;
	
	@ManyToOne
	@JoinColumn(name = "id_moneda_origen")
	private Moneda monedaOrigen;
	
	@ManyToOne
	@JoinColumn(name = "id_moneda_destino")
	private Moneda monedaDestino;
	
	@Column(name = "monto")	
	private Double monto;
	
	@Column(name = "fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;
	
}
