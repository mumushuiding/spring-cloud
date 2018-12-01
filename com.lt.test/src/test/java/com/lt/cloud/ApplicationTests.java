package com.lt.cloud;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.lt.cloud.pojo.Person;
import com.lt.cloud.utils.JsonUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	private Gson gson=JsonUtils.getGson();
	@Test
	public void contextLoads() {
	} 
	@Test 

	public void deserializeJson() throws SQLException {
//		Person person=new Person("王五", "xxxxxx", 14,1L);
		String json="{\"name\":\"王五\",\"address\":\"xxxxxx\",\"age\":\"\",\"id\":\"\"}";//会报empty string
		Person person=gson.fromJson(json, Person.class);
		System.out.println(person.toString());
		Connection connection=DriverManager.getConnection(url)  ;
		connection.rollback();
	}
}
