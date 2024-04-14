package models.interfaces;

public interface Response {

	void addHeader(String T, String V);
	
	void addBody(byte[] body);
	
}
