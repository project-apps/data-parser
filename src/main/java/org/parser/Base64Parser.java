package org.parser;

import java.util.Base64;

import javax.servlet.http.Cookie;

import org.springframework.util.SerializationUtils;

public class Base64Parser {
	
	public static String serialize(Object object) {
		return Base64.getUrlEncoder().encodeToString(SerializationUtils.serialize(object));
	}
	public static <T> T deserialize(Cookie cookie, Class<T> cls) {
		return cls.cast(SerializationUtils.deserialize(Base64.getUrlDecoder().decode(cookie.getValue())));
	}
	public static <T> T deserialize(String data, Class<T> cls) {
		return cls.cast(SerializationUtils.deserialize(Base64.getUrlDecoder().decode(data)));
	}
	public static String encodeToString (String data) {
		return Base64.getUrlEncoder().encodeToString(data.getBytes());
	}
	public static String decodeToString (String data) {
		return String.valueOf(Base64.getUrlDecoder().decode(data));
	}
}
