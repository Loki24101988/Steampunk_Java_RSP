package team.tmbe.model.world;

import java.util.ArrayList;

import team.tmbe.model.Thing;


public class Galaxy extends Thing {
	
	private final String NAME;
	private ArrayList<Planet> m_planets;
	
	public Galaxy(String NAME) {
		
		super();
		this.NAME = NAME;
		this.m_planets = new ArrayList<>();
		
	}
}
