package question1;

import models.enumeradores.TipoProtocolo;
import models.ftp.FtpProcoloco;
import models.ftp.FtpRequest;
import models.ftp.FtpResponse;
import models.http.HttpProtocolo;
import models.http.HttpRequest;
import models.http.HttpResponse;
import models.interfaces.Protocolo;

public class ProtocoloFactory {
	
	//Factory method
	public Protocolo create(String host, Integer porta, TipoProtocolo tipo) {
		Protocolo protocolo = null;
		if(tipo == TipoProtocolo.FTP) {
			protocolo = new FtpProcoloco().init(host, porta);
			protocolo.mensage(new FtpRequest(), new FtpResponse());
		}
		else if(tipo == TipoProtocolo.HTTP) {
			protocolo =  new HttpProtocolo().init(host, porta);
			protocolo.mensage(new HttpRequest(), new HttpResponse());
		}
		return protocolo;
	}
}
