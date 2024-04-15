package models.http;

import java.util.Map;

import models.interfaces.Request;

public class HTTPRequest implements Request{
	
	private Map<String, String> header;
	
	private byte[] body;
	
	public HTTPRequest() {
		System.out.println("*** httpRequest ***");
	}
	
	public HTTPRequest(Map<String, String> header, byte[] body) {
		this.header = header;
		this.body = body;
		System.out.println("*** httpRequest ***\n") ;
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
