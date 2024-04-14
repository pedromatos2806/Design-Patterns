package models.ftp;

import java.util.Map;

import models.interfaces.Request;

public class FtpRequest implements Request{
	
	private Map<String, String> header;
	
	private byte[] body;

	public FtpRequest(){
		System.out.println("*** ftpRequest ***");
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
