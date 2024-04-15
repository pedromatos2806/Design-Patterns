package question1;

import models.enumeradores.TipoProtocolo;
import models.ftp.FTPProtocolo;
import models.http.HTTPProtocolo;
import models.interfaces.Protocolo;

public class ProtocoloFactory {
	
	//Factory method
	public Protocolo create(String host, Integer porta, TipoProtocolo tipo) {
		Protocolo protocolo = null;
		
		if(tipo == TipoProtocolo.FTP) {
			protocolo = new FTPProtocolo(host, porta);		
		}
		else if(tipo == TipoProtocolo.HTTP) {
			protocolo =  new HTTPProtocolo(host, porta);
		}
		return protocolo;
	}
}
