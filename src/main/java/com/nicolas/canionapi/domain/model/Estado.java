package com.nicolas.canionapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Estado {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name = "cod_ibge")
	private Integer codigoIBGE;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sigla;
	
	@Column(nullable = false)
	private String regiao;

	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pais pais;
	
}
