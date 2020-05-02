package org.parser;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;


public class Base64Parser {
	
	public static String encodeToString (String data) throws UnsupportedEncodingException {
		return Base64.getUrlEncoder().encodeToString(data.getBytes());
	}
	public static String decodeToString (String data) throws UnsupportedEncodingException {
		return new String(Base64.getUrlDecoder().decode(data));
	}
	public static <T extends Serializable> String serialize(T obj) {
		return Base64.getEncoder().encodeToString(obj.toString().getBytes());
	}
	public static String deserialize(String src) {
		return new String(Base64.getDecoder().decode(src));
	}
	public static <T extends Serializable > String jsonSerializer(T obj) throws SerializeException {
		JsonSerializer serializer = JsonSerializer.DEFAULT_READABLE;
		return serializer.serializeToString(obj);
	}
	public static <T extends Serializable > T jsonDeserializer(String input, Class<T> type) throws ParseException {
		JsonParser parser = JsonParser.DEFAULT;
		return parser.parse(input, type);
	}
}
