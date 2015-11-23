package team.tmbe.model.livingThing.bodyParts;

import team.tmbe.model.Thing;
import team.tmbe.model.mainCharacterThings.EPositionOnBody;

public abstract class PartOfBody extends Thing {
	protected final EPositionOnBody m_POSITIONONBODY;

	protected PartOfBody(EPositionOnBody position) {
		super();
		this.m_POSITIONONBODY = position;
	}

}
