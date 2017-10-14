package com.wordpress.krogercode.exemploLombok.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BandaTest {

	@Test
	public void testeDeBuilder() {
		//	Os dados da banda a ser criada
		String nomeDaBanda = "Norwegian Aliens From The Grave";
		String biografia = "A banda surgiu para um teste, logo depois desapareceu!";
		String estilo = "Space Black Metal";
		List<String> integrantes = Arrays.asList("Hild3g4rd", "H4lvd4n");
		List<String> albuns = new ArrayList<>();
		List<String> turnes = Arrays.asList("Garage Fest '17", "XVII Porão Quente", "Mars Fest");
		
		//	Utilizando o builder
		Banda minhaBanda = new Banda.BandaBuilder()
				.nome(nomeDaBanda)
				.biografia(biografia)
				.estilo(estilo)
				.integrantes(integrantes)
				.albuns(albuns)
				.turnes(turnes)
				.build();
		
		Assert.assertTrue(minhaBanda.getNome().equals(nomeDaBanda));
		Assert.assertTrue(minhaBanda.getEstilo().equals(estilo));
		Assert.assertTrue(minhaBanda.getBiografia().equals(biografia));
		Assert.assertTrue(minhaBanda.getIntegrantes().equals(integrantes));
		Assert.assertTrue(minhaBanda.getAlbuns().isEmpty());
		Assert.assertTrue(minhaBanda.getTurnes().equals(turnes));
		
	}
	
}
