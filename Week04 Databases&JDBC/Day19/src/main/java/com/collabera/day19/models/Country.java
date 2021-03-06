package com.collabera.day19.models;

public class Country {
	private String code;
	private String name;
	private String continent;
	private String region;
	private int population;
	
	public Country() {
		super();
	}
	
	public Country(String code, String name, String continent, String region, int population) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.population = population;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return"Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region + ", population=" + population + "]";
	}
}
