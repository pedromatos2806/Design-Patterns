package question2;

import java.util.Map;
import models.ftp.FTPProtocolo;
import models.ftp.FTPRequest;
import models.ftp.FTPResponse;
import models.interfaces.Protocolo;
import models.interfaces.Request;
import models.interfaces.Response;

public class FtpAbstractFactory implements ProtocoloAbstractFactory{

	public Protocolo createProtocolo(String host, Integer porta) {
		Protocolo protocolo =   new FTPProtocolo(host, porta);
		return protocolo;
	}


	public Request getRequest(Map<String, String> header, byte[] body) {
		Request ftpRequest = new  FTPRequest(header, body);
		return ftpRequest;
	}


	public Response getResponse(Map<String, String> header, byte[] body) {
		Response ftpResponse = new FTPResponse(header, body);
		return ftpResponse;
	}


}
