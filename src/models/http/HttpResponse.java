package models.http;



import java.util.Map;

import models.interfaces.Response;

public class HttpResponse implements Response{
	private Map<String, String> header;
	
	private byte[] body;
	
	public HttpResponse(){
		System.out.println("*** htpResponse ***");
	}
	
	public Map<String, String> getHeader() {
		return header;
	}
	
	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	
	public byte[] getBody() {
		return body;
	}
	
	public void setBody(byte[] body) {
		this.body = body;
	}
	
	public void addHeader(String T, String S) {
		
	}
	
	public void addBody( byte[] body) {
		
	}

	
	
}
