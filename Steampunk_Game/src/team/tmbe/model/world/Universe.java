package team.tmbe.model.world;

import java.util.ArrayList;

import team.tmbe.model.Thing;

public  class Universe extends Thing {

	private final String NAME;
	private ArrayList<Planet> m_planets;
	
	public Universe(String NAME) {
		
		super();
		this.NAME = NAME;
		this.m_planets = new ArrayList<>();
		
	}
}
