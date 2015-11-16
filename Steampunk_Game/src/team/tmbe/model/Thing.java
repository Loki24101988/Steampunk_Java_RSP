package team.tmbe.model;

import java.math.BigInteger;

public abstract class Thing {

    protected final BigInteger m_ID;
    private static BigInteger ms_COUNTER = BigInteger.ZERO;

    protected Thing() {

        m_ID = ms_COUNTER;
        ms_COUNTER = ms_COUNTER.add(BigInteger.ONE);
    }

    public BigInteger getM_ID() {

        return m_ID;
    }

}
