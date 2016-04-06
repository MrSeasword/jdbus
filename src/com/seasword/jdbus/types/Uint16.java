package com.seasword.jdbus.types;

public class Uint16 implements NumericType {
	public final static TypeProperties itsProperties = new TypeProperties('q', 2, 2);
	
	public Uint16( int theValue ) {
		assert( (0 <= theValue) && theValue <= 0xFFFF );
		itsValue = theValue;
	}
	
	@Override
	public int intValue() {
		return itsValue;
	}

	@Override
	public long longValue() {
		return itsValue;
	}

	@Override
	public float floatValue() {
		return itsValue;
	}

	@Override
	public double doubleValue() {
		return itsValue;
	}

	@Override
	public TypeProperties getItsTypeProperties() {
		// TODO Auto-generated method stub
		return itsProperties;
	}

	private final int itsValue;
}
