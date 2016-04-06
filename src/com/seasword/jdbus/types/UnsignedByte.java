package com.seasword.jdbus.types;

public class UnsignedByte implements NumericType {
	public final static TypeProperties itsProperties = new TypeProperties('y', 1, 1);
	
	public UnsignedByte( int theValue ) {
		assert( (0 <= theValue) && theValue <= 0xFF );
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
		return itsProperties;
	}

	private final int itsValue;
}
