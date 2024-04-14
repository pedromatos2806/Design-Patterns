package models.interfaces;


public interface Protocolo {
	
	public Protocolo init(String host, Integer porta);
	
	void open();
	
	void close();
	
	void mensage(Request request, Response response);

}
