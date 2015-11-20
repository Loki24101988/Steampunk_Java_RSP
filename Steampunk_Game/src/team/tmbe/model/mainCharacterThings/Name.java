package team.tmbe.model.mainCharacterThings;

import java.util.ArrayList;
import java.util.List;

public class Name {
	private List<String> m_GivenNameList;
	private final String m_LastName;

	public Name(String m_GivenName, String m_LastName) {
		this.m_GivenNameList = new ArrayList<>();
		this.m_GivenNameList.add(m_GivenName);
		this.m_LastName = m_LastName;
	}

	public void addGivenName(String m_GivenName) {
		this.m_GivenNameList.add(m_GivenName);
	}

	public String get_m_LastName() {
		return this.m_LastName;

	}

	public List<String> get_m_GivenNameList() {
		return this.m_GivenNameList;
	}

	public int getNumberOfGivenNames() {
		return this.m_GivenNameList.size();
	}
}
