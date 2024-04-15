import java.util.HashMap;

import models.enumeradores.TipoProtocolo;
import models.http.HTTPRequest;
import models.http.HTTPResponse;
import question1.ProtocoloFactory;
import question2.FtpAbstractFactory;
import question2.HttpAbstractFactory;
import question2.ProtocoloAbstractFactory;

public class Aplication {

	public static void main(String[] args) {
		
		
		//factoryMethod();
		
		abstractFactory();
	}
	
	public  static void factoryMethod() {
		//Questão 1:	
		ProtocoloFactory protocoloFactory = new ProtocoloFactory();
		
		var protocolo = protocoloFactory.create("pc Pedro Matos"
													,8080
													,TipoProtocolo.FTP
												);
		protocolo.mensage( new HTTPRequest()
							, new HTTPResponse()
							);

		System.out.println(protocolo.toString()); 
	}

	
	
	public  static void abstractFactory() {
		//Questão 2:	
		ProtocoloAbstractFactory protocoloAbstractFactory1 = new HttpAbstractFactory();
		ProtocoloAbstractFactory protocoloAbstractFactory2 = new FtpAbstractFactory();
		
		protocoloAbstractFactory1.createProtocolo("host pc http",8080);
		
		protocoloAbstractFactory1.getRequest(null, null);
		
		protocoloAbstractFactory1.getResponse(null, null);
		
		
		protocoloAbstractFactory2.createProtocolo("host pc ftp",9090);
		
		protocoloAbstractFactory2.getRequest(null, null);
		
		protocoloAbstractFactory2.getResponse(null, null);
		
		
		
	}
}
