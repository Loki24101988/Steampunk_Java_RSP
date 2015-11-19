package team.tmbe.model.atoms;

import team.tmbe.model.unLivingThing.UnLivingThing;

/**
 * This class represents an element out of the perodic table.
 * 
 * @author loki
 *
 */
public final class Element extends UnLivingThing {

	private String m_Name;
	private int m_NumberOfElectrons;
	private int m_NumberOfNeutrons;
	private int m_NumberOfPositrons;
	private boolean m_IsIsotope;
	private int m_OrderNumber;
	private boolean m_IsRadioactive;
	private EListOfAtoms m_AtomType;
}
