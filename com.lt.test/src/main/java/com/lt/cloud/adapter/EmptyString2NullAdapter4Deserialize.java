package com.lt.cloud.adapter;

import java.lang.reflect.Type;

import org.springframework.test.context.transaction.AfterTransaction;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class EmptyString2NullAdapter4Deserialize<T> implements JsonDeserializer<T>{

	@SuppressWarnings("unchecked")
	@Override
	@AfterTransaction
	public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		System.out.println(typeOfT);
		if (json.getAsString().equals("")) {
            return null;
        }
		return (T) json.getAsJsonObject();

	}

}
