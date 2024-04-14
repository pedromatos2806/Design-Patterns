package models.http;

import models.interfaces.Protocolo;
import models.interfaces.Request;
import models.interfaces.Response;

public class HttpProtocolo implements Protocolo{

	private String host;
	
	private Integer porta;
		
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPorta() {
		return porta;
	}

	public void setPorta(Integer porta) {
		this.porta = porta;
	}

	public Protocolo init(String host, Integer porta) {
		this.host = host;
		this.porta = porta;
		return this;
	}

	public void open() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void mensage(Request request, Response response) {
		System.out.println("Mensagem em processamento recebida via " + request);
		System.out.println("Resposta gerada em " + response);
	}

	@Override
	public String toString() {
		return "HttpProtocolo [host=" + host + ", porta=" + porta + "]";
	}
	
}
