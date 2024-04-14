package models.ftp;

import models.interfaces.Protocolo;
import models.interfaces.Request;
import models.interfaces.Response;

public class FtpProcoloco implements Protocolo{
	
	private String host;
	
	private Integer porta;
	


	public Protocolo init(String host, Integer porta) {
		this.host = host;
		this.porta = porta;
		return this;
	}


	public void open() {
		System.out.println("abrindo a porta" + this.toString() );
	}

	public void close() {
		System.out.println("fechando a porta" + this.toString() );
	}


	public void mensage(Request request, Response response) {
		System.out.println("Mensagem em processamento recebida via " + request);
		System.out.println("Resposta gerada em " + response);
	}

	@Override
	public String toString() {
		return "FtpProcoloco [host=" + host + ", porta=" + porta + "]";
	}

}
