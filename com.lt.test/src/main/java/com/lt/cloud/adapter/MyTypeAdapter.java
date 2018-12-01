package com.lt.cloud.adapter;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class MyTypeAdapter<T>  extends TypeAdapter<T>{

	@Override
	public void write(JsonWriter out, T value) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T read(JsonReader in) throws IOException {
		if("".equals(in.nextString())) return null;
		return (T) in.nextString();
	}

}
