package team.tmbe.model.world;

import java.util.ArrayList;

import team.tmbe.model.Thing;

public class Planet extends Thing {

	private final String NAME;
	private ArrayList<Town> m_towns;

	public Planet(String NAME) {

		super();
		this.NAME = NAME;
		this.m_towns = new ArrayList<>();

	}

	public ArrayList<Town> getM_towns() {
		return m_towns;
	}

	public void setM_towns(ArrayList<Town> m_towns) {
		this.m_towns = m_towns;
	}

	public String getNAME() {
		return NAME;
	}

}
