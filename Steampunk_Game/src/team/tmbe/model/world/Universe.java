package team.tmbe.model.world;

import java.util.ArrayList;

import team.tmbe.model.Thing;

public class Universe extends Thing {

	private final String NAME;
	private ArrayList<Galaxy> m_galaxies;

	public Universe(String NAME) {

		super();
		this.NAME = NAME;
		this.m_galaxies = new ArrayList<>();

	}

	public ArrayList<Galaxy> getM_galaxies() {
		return m_galaxies;
	}

	public void setM_galaxies(ArrayList<Galaxy> m_galaxies) {
		this.m_galaxies = m_galaxies;
	}

	public String getNAME() {
		return NAME;
	}

}
