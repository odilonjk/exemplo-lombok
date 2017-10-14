package com.wordpress.krogercode.exemploLombok.classes;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Banda {

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String estilo;

	@Getter @Setter
	private List<String> integrantes;
	
	@Getter @Setter
	private List<String> albuns;
	
	@Getter @Setter
	private List<String> turnes;
	
	@Getter @Setter
	private String biografia;
	
}
