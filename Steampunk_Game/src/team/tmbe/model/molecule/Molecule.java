package team.tmbe.model.molecule;

import java.util.ArrayList;
import java.util.List;

import team.tmbe.model.atoms.Element;

public class Molecule {

	private List<Element> m_ElementsOfMolecule;
	private List<Molecule> m_SubMolecules;
	private final String m_MoleculeName;

	public Molecule(String m_MoleculeName) {
		this.m_MoleculeName = m_MoleculeName;
		this.m_ElementsOfMolecule = new ArrayList<>();
		this.m_SubMolecules = new ArrayList<>();
	}

	public void addElement(Element newElement) {
		this.m_ElementsOfMolecule.add(newElement);
	}

	public void addSubMolecule(Molecule newMolecule) {
		this.m_SubMolecules.add(newMolecule);
	}

}
