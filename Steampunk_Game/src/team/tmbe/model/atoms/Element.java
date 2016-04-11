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
	private int numberOfConnections;
    
    public String getM_Name() {
    
        return m_Name;
    }
    
    public void setM_Name(String m_Name) {
    
        this.m_Name = m_Name;
    }
    
    public int getM_NumberOfElectrons() {
    
        return m_NumberOfElectrons;
    }
    
    public void setM_NumberOfElectrons(int m_NumberOfElectrons) {
    
        this.m_NumberOfElectrons = m_NumberOfElectrons;
    }
    
    public int getM_NumberOfNeutrons() {
    
        return m_NumberOfNeutrons;
    }
    
    public void setM_NumberOfNeutrons(int m_NumberOfNeutrons) {
    
        this.m_NumberOfNeutrons = m_NumberOfNeutrons;
    }
    
    public int getM_NumberOfPositrons() {
    
        return m_NumberOfPositrons;
    }
    
    public void setM_NumberOfPositrons(int m_NumberOfPositrons) {
    
        this.m_NumberOfPositrons = m_NumberOfPositrons;
    }
    
    public boolean isM_IsIsotope() {
    
        return m_IsIsotope;
    }
    
    public void setM_IsIsotope(boolean m_IsIsotope) {
    
        this.m_IsIsotope = m_IsIsotope;
    }
    
    public int getM_OrderNumber() {
    
        return m_OrderNumber;
    }
    
    public void setM_OrderNumber(int m_OrderNumber) {
    
        this.m_OrderNumber = m_OrderNumber;
    }
    
    public boolean isM_IsRadioactive() {
    
        return m_IsRadioactive;
    }
    
    public void setM_IsRadioactive(boolean m_IsRadioactive) {
    
        this.m_IsRadioactive = m_IsRadioactive;
    }
    
    public EListOfAtoms getM_AtomType() {
    
        return m_AtomType;
    }
    
    public void setM_AtomType(EListOfAtoms m_AtomType) {
    
        this.m_AtomType = m_AtomType;
    }
    
    public int getNumberOfConnections() {
    
        return numberOfConnections;
    }
    
    public void setNumberOfConnections(int numberOfConnections) {
    
        this.numberOfConnections = numberOfConnections;
    }
	
	
}
