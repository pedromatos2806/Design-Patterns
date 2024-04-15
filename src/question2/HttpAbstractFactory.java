package question2;

import java.util.Map;

import models.http.HTTPProtocolo;
import models.http.HTTPRequest;
import models.http.HTTPResponse;
import models.interfaces.Protocolo;
import models.interfaces.Request;
import models.interfaces.Response;

public class HttpAbstractFactory implements ProtocoloAbstractFactory{

	@Override
	public Protocolo createProtocolo(String host, Integer porta) {
		Protocolo protocolo = new HTTPProtocolo(host, porta);
		return protocolo;
	}

	@Override
	public Request getRequest(Map<String, String> header, byte[] body) {
		Request request = new HTTPRequest(header,body);
		return request;
	}

	@Override
	public Response getResponse(Map<String, String> header, byte[] body) {
		Response response = new HTTPResponse(header,body);
		return response;
	}

}
