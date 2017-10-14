package com.wordpress.krogercode.exemploLombok.classes;

import java.util.List;

public class Banda {
	
	private String nome;
	
	private String estilo;

	private List<String> integrantes;
	
	private List<String> albuns;
	
	private List<String> turnes;
	
	private String biografia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public List<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<String> integrantes) {
		this.integrantes = integrantes;
	}

	public List<String> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<String> albuns) {
		this.albuns = albuns;
	}

	public List<String> getTurnes() {
		return turnes;
	}

	public void setTurnes(List<String> turnes) {
		this.turnes = turnes;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	public static class BandaBuilder {
		
		private String nome;
		private String estilo;
		private List<String> integrantes;
		private List<String> albuns;
		private List<String> turnes;
		private String biografia;
		

		public BandaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public BandaBuilder estilo(String estilo) {
			this.estilo = estilo;
			return this;
		}
		
		public BandaBuilder integrantes(List<String> integrantes) {
			this.integrantes = integrantes;
			return this;
		}
		
		public BandaBuilder albuns(List<String> albuns) {
			this.albuns = albuns;
			return this;
		}
		
		public BandaBuilder turnes(List<String> turnes) {
			this.turnes = turnes;
			return this;
		}
		
		public BandaBuilder biografia(String biografia) {
			this.biografia = biografia;
			return this;
		}
		
		public Banda build() {
			Banda banda = new Banda();
			banda.setNome(nome);
			banda.setEstilo(estilo);
			banda.setIntegrantes(integrantes);
			banda.setAlbuns(albuns);
			banda.setTurnes(turnes);
			banda.setBiografia(biografia);
			return banda;
		}
	}
	
}

