package team.tmbe.model.livingThing.bodyParts;

import team.tmbe.model.mainCharacterThings.EEyeColor;
import team.tmbe.model.mainCharacterThings.EPositionOnBody;

public class Ear extends PartOfBody {

	protected EEyeColor m_EyeColor;

	public Ear(EEyeColor m_EyeColor, EPositionOnBody m_PositionOfBody) {
		super(m_PositionOfBody);
		this.m_EyeColor = m_EyeColor;
	}
}
