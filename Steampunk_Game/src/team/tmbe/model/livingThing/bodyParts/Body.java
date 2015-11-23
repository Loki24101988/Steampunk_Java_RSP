package team.tmbe.model.livingThing.bodyParts;

import java.util.ArrayList;

import team.tmbe.model.mainCharacterThings.EPositionOnBody;
import team.tmbe.model.mainCharacterThings.ESkinColor;

public class Body extends PartOfBody {

	protected ESkinColor m_SkinColor;
	protected ArrayList<Arm> m_Arms;
	protected ArrayList<Leg> m_Legs;
	protected Head m_Head;

	public Body(ESkinColor m_SkinColor) {
		super(EPositionOnBody.LEFT);
		this.m_SkinColor = m_SkinColor;
	}
}
