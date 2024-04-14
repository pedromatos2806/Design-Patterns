package models.interfaces;

public interface Request {
	
	void addHeader(String T, String V);
	
	void addBody(byte[] body);
}
