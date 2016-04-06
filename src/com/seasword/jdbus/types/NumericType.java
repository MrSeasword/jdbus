package com.seasword.jdbus.types;

public interface NumericType extends BasicType {

	int intValue();

	long longValue();

	float floatValue();

	double doubleValue();

}