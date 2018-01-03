package com.gotee.post;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Response {
	private int status_Code;
	private String status_Descripation;
	private Object result;

	public int getStatus_Code() {
		return status_Code;
	}

	public void setStatus_Code(int status_Code) {
		this.status_Code = status_Code;
	}

	public String getStatus_Descripation() {
		return status_Descripation;
	}

	public void setStatus_Descripation(String status_Descripation) {
		this.status_Descripation = status_Descripation;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public Response(int status_Code, String status_Descripation, Object result) throws IOException {
		super();
		ObjectMapper mapper = new ObjectMapper();
		try {

			this.result = mapper.writeValueAsString(result);
			System.out.println("result"+mapper.writeValueAsString(result));
			JSONParser parser = new JSONParser();
			try {
				this.result = parser.parse((String) this.result);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		this.status_Code = status_Code;
		this.status_Descripation = status_Descripation;
		this.result = result;

	}

	public Response(int status_Code, String status_Descripation) {
		super();
		this.status_Code = status_Code;
		this.status_Descripation = status_Descripation;
	}

	
}
