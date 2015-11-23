package team.tmbe.model.livingThing.bodyParts;

import java.util.ArrayList;

import team.tmbe.model.mainCharacterThings.EPositionOnBody;

public class Head extends Extremities {

	protected Nose m_Nose;
	protected Mouth m_Mouth;
	protected ArrayList<Eye> m_Eyes;

	public Head() {
		super(EPositionOnBody.TOP);
	}
}
