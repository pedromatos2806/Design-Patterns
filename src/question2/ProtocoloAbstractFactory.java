package question2;

import java.util.Map;

import models.enumeradores.TipoProtocolo;
import models.interfaces.Protocolo;
import models.interfaces.Request;
import models.interfaces.Response;

public interface ProtocoloAbstractFactory {
	
	public Protocolo createProtocolo(String host, Integer porta);
	
	public Request getRequest(Map<String, String> header, byte[] body);
	
	public Response getResponse(Map<String, String> header, byte[] body);
}
