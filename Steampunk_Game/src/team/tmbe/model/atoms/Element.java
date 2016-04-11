package team.tmbe.model.atoms;

import team.tmbe.model.unLivingThing.UnLivingThing;

/**
 * This class represents an element out of the perodic table.
 * 
 * @author loki
 *
 */
public final class Element extends UnLivingThing {

	private final String m_Name;
	private final int m_NumberOfElectrons;
	private final int m_NumberOfNeutrons;
	private final int m_NumberOfPositrons;
	private final boolean m_IsIsotope;
	private final int m_OrderNumber;
	private final boolean m_IsRadioactive;
	private final EListOfAtoms m_AtomType;
	private final int numberOfConnections;
    
	public Element(String name, int numberOfElectrons, int numberOfNeutrons, int numberOfPositrons, boolean isIsotope,
	        int orderNumber, boolean isRadioactive, EListOfAtoms atomType, int numberOfConnections) {
	    this.m_Name = name;
	    this.m_NumberOfElectrons = numberOfConnections;
	    this.m_NumberOfNeutrons = numberOfNeutrons;
	    this.m_NumberOfPositrons = numberOfPositrons;
	    this.m_IsIsotope = isIsotope;
	    this.m_OrderNumber = orderNumber;
	    this.m_IsRadioactive = isRadioactive;
	    this.m_AtomType = atomType;
	    this.numberOfConnections = numberOfConnections;
	}
	
    public String getM_Name() {
    
        return m_Name;
    }
    
    public int getM_NumberOfElectrons() {
    
        return m_NumberOfElectrons;
    }
    
    public int getM_NumberOfNeutrons() {
    
        return m_NumberOfNeutrons;
    }
    
    public int getM_NumberOfPositrons() {
    
        return m_NumberOfPositrons;
    }
    
    public boolean isM_IsIsotope() {
    
        return m_IsIsotope;
    }
    
    public int getM_OrderNumber() {
    
        return m_OrderNumber;
    }
    
    public boolean isM_IsRadioactive() {
    
        return m_IsRadioactive;
    }
    
    public EListOfAtoms getM_AtomType() {
    
        return m_AtomType;
    }
    
    public int getNumberOfConnections() {
    
        return numberOfConnections;
    }
    
    
	
	
}
