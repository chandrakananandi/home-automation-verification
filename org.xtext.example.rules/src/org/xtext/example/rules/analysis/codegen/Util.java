package org.xtext.example.rules.analysis.codegen;

public class Util {

	public static void postUpdate (Object o1, Object o2) {
		// doesn't matter what happens here.
	}
	
	public static Number f(Object... arguments) {
		// doesn't matter what happens here but the variable to which this is assigned is affected by the arguments.
		return null;
	}
	
	public static Boolean cond(Object... arguments) {
		// doesn't matter what happens here.
		return null;
	}
}
