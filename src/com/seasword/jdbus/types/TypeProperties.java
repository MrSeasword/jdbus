package com.seasword.jdbus.types;

public class TypeProperties {
	public final char itsSpecifier;
	public final int  itsAlignment;
	public final int  itsSize;
	
	public TypeProperties( char theSpecifier,
							int theAlignment,
							int theSize ) {
		itsSpecifier = theSpecifier;
		itsAlignment = theAlignment;
		itsSize      = theSize;
	}
}

