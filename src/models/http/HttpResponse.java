package models.http;



import java.util.Map;

import models.interfaces.Response;

public class HTTPResponse implements Response{
	
	private Map<String, String> header;
	
	private byte[] body;
	
	public HTTPResponse(){
		System.out.println("*** htpResponse ***");
		
	}
	
	public HTTPResponse(Map<String,String> header, byte[] body) {
		this.header = header;
		this.body = body;
		System.out.println("*** htpResponse ***\n") ;
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
