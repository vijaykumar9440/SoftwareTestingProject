package com.TestNGscripts;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class writtingdata_to_JSONFile {
	
	
	@Test
	public void writtingdatato_JSON_File() throws IOException
	{
		JSONObject obj = new JSONObject();
		obj.put("Employee id","1234");
		obj.put("First name", "Vijay");
		obj.put("last name", "Kumar");
		obj.put("country", "India");
		
		FileWriter file = new FileWriter("json\\test.json",false);
		file.write(obj.toJSONString());
		file.close();
		
		
		
	}

}
