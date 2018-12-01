package com.lt.cloud.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.lt.cloud.adapter.EmptyString2NullAdapter4Deserialize;


public class JsonUtils {
	private static final Gson gson;
	static {
		gson=new GsonBuilder()
				.setDateFormat("yyyy-MM-dd hh:mm:ss")
				.registerTypeHierarchyAdapter(Number.class, new EmptyString2NullAdapter4Deserialize<>())
				.create();
		System.out.println("初始化gson:"+gson.getClass());
	}
	public static Gson getGson() {
		return gson;
	}
}
