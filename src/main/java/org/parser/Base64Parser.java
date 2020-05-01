package org.parser;

import java.util.Base64;


public class Base64Parser {
	
	public static String encodeToString (String data) {
		return Base64.getUrlEncoder().encodeToString(data.getBytes());
	}
	public static String decodeToString (String data) {
		return String.valueOf(Base64.getUrlDecoder().decode(data));
	}
}
