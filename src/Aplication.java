	import models.enumeradores.TipoProtocolo;
import question1.ProtocoloFactory;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Questão 1:
		
		ProtocoloFactory protocoloFactory = new ProtocoloFactory();
		
		var protocolo = protocoloFactory.create("pc Pedro Matos", 8080, TipoProtocolo.HTTP);
		
		System.out.println(protocolo.toString()); 
		
	}

}
