package models.ftp;

import java.util.Map;

import models.interfaces.Response;


public class FTPResponse implements Response{
	
	private Map<String, String> header;
	
	private byte[] body;
		
	public FTPResponse(){
		System.out.println("*** ftpResponse ***");
	}
	
	public FTPResponse(Map<String, String> header, byte[] body) {
		super();
		this.header = header;
		this.body = body;
		System.out.println("*** ftpResponse ***\n") ;
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
