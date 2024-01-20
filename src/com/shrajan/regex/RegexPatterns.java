package com.shrajan.regex;

public interface RegexPatterns {

	public static final String IDENTIFY_COMMA_POSSITIONS_IN_NUMERIC_STRING = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
	public static final String VALIDATE_EMAIL_ADDRESS = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	//[a-zA-Z0-9_]
	public static final String WORDS = "\b";
}
